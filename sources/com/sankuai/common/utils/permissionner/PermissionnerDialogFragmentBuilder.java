package com.sankuai.common.utils.permissionner;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.Permissionner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PermissionnerDialogFragmentBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Set<OnDetachListener> listeners;

    public static void registerOnDetachListener(OnDetachListener onDetachListener) {
        Object[] objArr = {onDetachListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "037c48f1194005a36f8fd539649fbdd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "037c48f1194005a36f8fd539649fbdd7");
            return;
        }
        if (listeners == null) {
            listeners = new HashSet();
        }
        listeners.add(onDetachListener);
    }

    public static void unregisterOnDetachListener(OnDetachListener onDetachListener) {
        Object[] objArr = {onDetachListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55357cdf061aa74533a84a738957e1d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55357cdf061aa74533a84a738957e1d9");
        } else if (listeners != null) {
            listeners.remove(onDetachListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyAllOnDetachListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5594294c173190d7da44c95a10d18253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5594294c173190d7da44c95a10d18253");
        } else if (listeners != null) {
            for (OnDetachListener onDetachListener : listeners) {
                if (onDetachListener != null) {
                    onDetachListener.onDetach();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class PermissionnerDialogFragment extends DialogFragment {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.app.DialogFragment
        @RequiresApi(api = 23)
        public Dialog onCreateDialog(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bac6d3c14bdb6680e728971493dc4aa5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bac6d3c14bdb6680e728971493dc4aa5");
            }
            super.onCreateDialog(bundle);
            Bundle arguments = getArguments();
            ArrayList<String> stringArrayList = arguments != null ? arguments.getStringArrayList("permission_groups") : null;
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), 5);
            builder.setView(PermissionnerDialogFragmentBuilder.generateDialogView(stringArrayList, getActivity().getLayoutInflater(), getContext()));
            AlertDialog create = builder.create();
            Window window = create.getWindow();
            if (window != null) {
                window.setGravity(48);
                window.setDimAmount(0.0f);
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            return create;
        }

        @Override // android.app.DialogFragment, android.app.Fragment
        public void onStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90c835fd53e88a8dfdf4691f480ccfbb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90c835fd53e88a8dfdf4691f480ccfbb");
                return;
            }
            super.onStart();
            Dialog dialog = getDialog();
            if (dialog == null || dialog.getWindow() == null) {
                return;
            }
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.width = -1;
            dialog.getWindow().setAttributes(attributes);
        }

        @Override // android.app.DialogFragment, android.app.Fragment
        public void onActivityCreated(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc6c7f739df8431d5a2fd20cf0823a48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc6c7f739df8431d5a2fd20cf0823a48");
                return;
            }
            setShowsDialog(false);
            super.onActivityCreated(bundle);
        }

        @Override // android.app.DialogFragment, android.app.Fragment
        public void onDetach() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09bff2376ed94b8737a534e7377b56f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09bff2376ed94b8737a534e7377b56f3");
                return;
            }
            PermissionnerDialogFragmentBuilder.notifyAllOnDetachListener();
            super.onDetach();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class PermissionnerSupportDialogFragment extends android.support.v4.app.DialogFragment {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.support.v4.app.DialogFragment
        @NonNull
        public Dialog onCreateDialog(@Nullable Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5acc2931669839cc6de6eb63a8fee467", RobustBitConfig.DEFAULT_VALUE)) {
                return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5acc2931669839cc6de6eb63a8fee467");
            }
            super.onCreateDialog(bundle);
            Bundle arguments = getArguments();
            ArrayList<String> stringArrayList = arguments != null ? arguments.getStringArrayList("permission_groups") : null;
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), 5);
            builder.setView(PermissionnerDialogFragmentBuilder.generateDialogView(stringArrayList, getActivity().getLayoutInflater(), getContext()));
            AlertDialog create = builder.create();
            Window window = create.getWindow();
            if (window != null) {
                window.setGravity(48);
                window.setDimAmount(0.0f);
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            return create;
        }

        @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
        public void onStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24f0199bf5acfb7064ef1a4d6f7f01bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24f0199bf5acfb7064ef1a4d6f7f01bb");
                return;
            }
            super.onStart();
            Dialog dialog = getDialog();
            if (dialog == null || dialog.getWindow() == null) {
                return;
            }
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.width = -1;
            dialog.getWindow().setAttributes(attributes);
        }

        @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
        public void onActivityCreated(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "971471a5aa679b7bfab11da385ed713f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "971471a5aa679b7bfab11da385ed713f");
                return;
            }
            setShowsDialog(false);
            super.onActivityCreated(bundle);
        }

        @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
        public void onDetach() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b18daf40b7003a5bc6be1b8fd75f041", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b18daf40b7003a5bc6be1b8fd75f041");
                return;
            }
            PermissionnerDialogFragmentBuilder.notifyAllOnDetachListener();
            super.onDetach();
        }
    }

    public static PermissionnerDialogFragment getInstance(@NonNull ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1b33e257d864e01ec181cf9e62f30b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (PermissionnerDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1b33e257d864e01ec181cf9e62f30b2");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        PermissionnerDialogFragment permissionnerDialogFragment = new PermissionnerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("permission_groups", arrayList);
        permissionnerDialogFragment.setArguments(bundle);
        return permissionnerDialogFragment;
    }

    public static PermissionnerSupportDialogFragment getSupportInstance(@NonNull ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69d7eca2657142c794685a64d6082bdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (PermissionnerSupportDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69d7eca2657142c794685a64d6082bdc");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        PermissionnerSupportDialogFragment permissionnerSupportDialogFragment = new PermissionnerSupportDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("permission_groups", arrayList);
        permissionnerSupportDialogFragment.setArguments(bundle);
        return permissionnerSupportDialogFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static View generateDialogView(@NonNull ArrayList<String> arrayList, LayoutInflater layoutInflater, Context context) {
        Object[] objArr = {arrayList, layoutInflater, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7cace8dcdbb4e5d9b28a04917cc75ba2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7cace8dcdbb4e5d9b28a04917cc75ba2");
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Permissionner.GroupConfig configByGroup = Permissionner.getConfigByGroup(next);
            Permissionner.GroupConfig defaultConfigByGroup = Permissionner.getDefaultConfigByGroup(next);
            View inflate = layoutInflater.inflate(Permissionner.getItemLayoutResource(), (ViewGroup) linearLayout, false);
            if (configByGroup != null && inflate != null) {
                ImageView imageView = (ImageView) inflate.findViewById(R.id.permissionner_item_icon);
                if (imageView != null) {
                    Drawable drawableWithContext = getDrawableWithContext(configByGroup.itemIconResource != null ? configByGroup.itemIconResource : defaultConfigByGroup != null ? defaultConfigByGroup.itemIconResource : null, context);
                    if (drawableWithContext != null) {
                        imageView.setImageDrawable(drawableWithContext);
                    }
                }
                TextView textView = (TextView) inflate.findViewById(R.id.permissionner_item_title);
                if (textView != null) {
                    String stringWithContext = getStringWithContext(configByGroup.itemTitle != null ? configByGroup.itemTitle : defaultConfigByGroup != null ? defaultConfigByGroup.itemTitle : null, context);
                    if (stringWithContext != null) {
                        textView.setText(stringWithContext);
                    }
                }
                TextView textView2 = (TextView) inflate.findViewById(R.id.permissionner_item_body);
                if (textView2 != null) {
                    String stringWithContext2 = getStringWithContext(configByGroup.itemBody != null ? configByGroup.itemBody : defaultConfigByGroup != null ? defaultConfigByGroup.itemBody : null, context);
                    if (stringWithContext2 != null) {
                        textView2.setText(stringWithContext2);
                    }
                }
                linearLayout.addView(inflate);
            }
        }
        return linearLayout;
    }

    private static String getStringWithContext(Integer num, Context context) {
        Object[] objArr = {num, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9094332d502e5c695b4afe9af2476129", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9094332d502e5c695b4afe9af2476129");
        }
        if (num == null) {
            return null;
        }
        try {
            return context.getString(num.intValue());
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Drawable getDrawableWithContext(Integer num, Context context) {
        Object[] objArr = {num, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a826c0ab363fc4b248d1af994c04903", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a826c0ab363fc4b248d1af994c04903");
        }
        if (num == null) {
            return null;
        }
        try {
            return context.getResources().getDrawable(num.intValue());
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
