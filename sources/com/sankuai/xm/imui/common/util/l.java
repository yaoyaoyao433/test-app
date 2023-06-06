package com.sankuai.xm.imui.common.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.imui.session.view.SafeDialog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public static final View.OnLongClickListener b = new View.OnLongClickListener() { // from class: com.sankuai.xm.imui.common.util.l.2
        public static ChangeQuickRedirect a;

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bde221f69a9dc70d2255c0e77a06725", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bde221f69a9dc70d2255c0e77a06725")).booleanValue();
            }
            return true;
        }
    };

    public static void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbb6e34c893ebb00d0b7be28f902167a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbb6e34c893ebb00d0b7be28f902167a");
        } else if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f383a81f93f54220fc486b54d58535e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f383a81f93f54220fc486b54d58535e3");
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static boolean a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcdf0159455ccb5d9151b8dd6e34b22b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcdf0159455ccb5d9151b8dd6e34b22b")).booleanValue();
        }
        if (view == null || view2 == null) {
            return false;
        }
        if (view == view2) {
            return true;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static int b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50db7c569809936d9da8a6274a62eb84", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50db7c569809936d9da8a6274a62eb84")).intValue();
        }
        if (view != null && view.isShown() && view.getVisibility() == 0) {
            int height = view.getHeight();
            int width = view.getWidth();
            if (width <= 0 || height <= 0) {
                return 0;
            }
            Rect rect = new Rect();
            view.getLocalVisibleRect(rect);
            int abs = Math.abs(rect.bottom - rect.top);
            int abs2 = Math.abs(rect.left - rect.right);
            if (abs <= 0 || abs2 <= 0) {
                return 0;
            }
            float f = ((abs * abs2) * 1.0f) / (height * width);
            if (f >= 1.0f) {
                return 100;
            }
            if (f <= 0.0f) {
                return 0;
            }
            return (int) (f * 100.0f);
        }
        return 0;
    }

    public static void a(final Context context, int... iArr) {
        Object[] objArr = {context, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "729ee22f4c8ca3455110cd7c758ca4b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "729ee22f4c8ca3455110cd7c758ca4b9");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb.append(context.getResources().getString(iArr[0]));
        }
        String sb2 = sb.toString();
        if (Build.VERSION.SDK_INT >= 23) {
            new SafeDialog.a(context).b(context.getString(R.string.xm_sdk_permission_long, sb2, sb2)).a(R.string.xm_sdk_setting, new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.imui.common.util.l.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ad0ff196eb21efd8e88f9dd088cffb7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ad0ff196eb21efd8e88f9dd088cffb7");
                        return;
                    }
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    context.startActivity(intent);
                }
            }).b(R.string.xm_sdk_btn_cancel, (DialogInterface.OnClickListener) null).b();
        } else {
            ad.a(context, context.getString(R.string.xm_sdk_no_permission, sb2));
        }
    }

    public static void a(int i, View... viewArr) {
        Object[] objArr = {Integer.valueOf(i), viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea72b299c9772d52c9ac35ca1c6b15e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea72b299c9772d52c9ac35ca1c6b15e8");
        } else if ((i == 0 || i == 4 || i == 8) && !com.sankuai.xm.base.util.b.b(viewArr)) {
            for (View view : viewArr) {
                if (view != null && view.getVisibility() != i) {
                    view.setVisibility(i);
                }
            }
        }
    }

    public static int a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bb953e59f59e890f99f0e4a8590f81c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bb953e59f59e890f99f0e4a8590f81c")).intValue();
        }
        int lineCount = textView.getLineCount() - 1;
        if (lineCount >= 0) {
            Layout layout = textView.getLayout();
            Rect rect = new Rect();
            int lineBounds = textView.getLineBounds(lineCount, rect);
            if (layout == null || textView.getMeasuredHeight() != textView.getLayout().getHeight()) {
                return 0;
            }
            return rect.bottom - (lineBounds + layout.getPaint().getFontMetricsInt().bottom);
        }
        return 0;
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "934d8f83f6d21daaf46bd39040ea0ceb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "934d8f83f6d21daaf46bd39040ea0ceb")).booleanValue();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        return ActivityUtils.a(context, intent, R.string.xm_sdk_open_link_fail);
    }

    public static boolean b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91ead8375e78b8e52a87287dcd9b6905", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91ead8375e78b8e52a87287dcd9b6905")).booleanValue();
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(str));
        return ActivityUtils.a(context, intent, R.string.xm_sdk_open_phone_call_fail);
    }
}
