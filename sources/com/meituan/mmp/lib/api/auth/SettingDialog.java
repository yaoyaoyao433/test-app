package com.meituan.mmp.lib.api.auth;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.mmp.lib.api.auth.ForegroundAndBackgroundAuthGroupSettingDialog;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SettingDialog extends PageDialog {
    public static ChangeQuickRedirect a;
    private Context b;
    private com.meituan.mmp.lib.config.a e;

    public static /* synthetic */ void a(SettingDialog settingDialog, final h hVar, a.C0395a c0395a) {
        Object[] objArr = {hVar, c0395a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, settingDialog, changeQuickRedirect, false, "241e5709f27ed64a290cf035c46aa8f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, settingDialog, changeQuickRedirect, false, "241e5709f27ed64a290cf035c46aa8f3");
            return;
        }
        new c();
        final String b = c.b(hVar.e);
        c0395a.a.setText(b);
        c0395a.c.setChecked(hVar.f);
        c0395a.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.mmp.lib.api.auth.SettingDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc7237576b0d2a9ea230008da927ef33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc7237576b0d2a9ea230008da927ef33");
                    return;
                }
                new c();
                c.a(SettingDialog.this.b, SettingDialog.this.e.c(), hVar.e, z);
                MMPEnvHelper.getLogger().mgeClick(SettingDialog.this.e.c(), "c_group_9ly9ekzg", "b_group_3efs4g9l_mc", new Logger.a().a("title", SettingDialog.this.e.d()).a("button_name", b).b);
            }
        });
    }

    public static /* synthetic */ void a(SettingDialog settingDialog, h hVar, a.C0395a c0395a, View view) {
        Object[] objArr = {hVar, c0395a, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, settingDialog, changeQuickRedirect, false, "012d909e2d72ac9d3a09c070278c1af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, settingDialog, changeQuickRedirect, false, "012d909e2d72ac9d3a09c070278c1af7");
            return;
        }
        final ForegroundAndBackgroundAuthGroup foregroundAndBackgroundAuthGroup = (ForegroundAndBackgroundAuthGroup) hVar;
        c0395a.a.setText(foregroundAndBackgroundAuthGroup.c());
        final TextView textView = c0395a.b;
        c0395a.b.setText(foregroundAndBackgroundAuthGroup.a());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.auth.SettingDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8dab92602006b1c0ba23db731d65ebd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8dab92602006b1c0ba23db731d65ebd");
                    return;
                }
                ForegroundAndBackgroundAuthGroupSettingDialog foregroundAndBackgroundAuthGroupSettingDialog = new ForegroundAndBackgroundAuthGroupSettingDialog(SettingDialog.this.b, SettingDialog.this.e, foregroundAndBackgroundAuthGroup);
                foregroundAndBackgroundAuthGroupSettingDialog.b = new ForegroundAndBackgroundAuthGroupSettingDialog.a() { // from class: com.meituan.mmp.lib.api.auth.SettingDialog.2.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.api.auth.ForegroundAndBackgroundAuthGroupSettingDialog.a
                    public final void a(String str) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0acf1a41879ca30489b978b82ff5bc8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0acf1a41879ca30489b978b82ff5bc8");
                        } else {
                            textView.setText(str);
                        }
                    }
                };
                foregroundAndBackgroundAuthGroupSettingDialog.show();
            }
        });
    }

    public SettingDialog(Context context, com.meituan.mmp.lib.config.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b074aca7d5c3cab4577f8c6b72a03c0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b074aca7d5c3cab4577f8c6b72a03c0c");
            return;
        }
        this.b = context;
        this.e = aVar;
        String c = aVar.c();
        View inflate = LayoutInflater.from(context).inflate(R.layout.mmp_setting_dialog, (ViewGroup) null);
        a(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.mmp_setting_title);
        ListView listView = (ListView) inflate.findViewById(R.id.mmp_setting_list);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mmp_setting_no_auth);
        new c();
        Map<String, Boolean> a2 = c.a(context, c);
        a aVar2 = new a(a(a2));
        if (a2.size() == 0) {
            textView.setVisibility(8);
            listView.setVisibility(8);
            textView2.setText(aVar.d() + "未使用你的任何信息");
            return;
        }
        textView2.setVisibility(8);
        textView.setText(CommonConstant.Symbol.DOUBLE_QUOTES + aVar.d() + "\"使用我的");
        listView.setAdapter((ListAdapter) aVar2);
    }

    @Override // com.meituan.mmp.lib.api.auth.PageDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d69ff9ba504114e27558c12e5cddc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d69ff9ba504114e27558c12e5cddc2");
            return;
        }
        super.show();
        MMPEnvHelper.getLogger().mgePageView(this.e.c(), "c_group_9ly9ekzg", new Logger.a().a("title", this.e.d()).b);
    }

    @Override // com.meituan.mmp.lib.api.auth.PageDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff6201710117718e24642d7f5d210eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff6201710117718e24642d7f5d210eb");
            return;
        }
        super.dismiss();
        MMPEnvHelper.getLogger().mgeClick(this.e.c(), "c_group_9ly9ekzg", "b_group_3efs4g9l_mc", new Logger.a().a("title", this.e.d()).a("button_name", "返回").b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        public List<h> b;

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 2;
        }

        public a(List<h> list) {
            Object[] objArr = {SettingDialog.this, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397a03f3d41f9e58effc15e2aa97e4b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397a03f3d41f9e58effc15e2aa97e4b8");
            } else {
                this.b = list;
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abfa17f9ff23aca84a7b9efe06c437de", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abfa17f9ff23aca84a7b9efe06c437de")).intValue() : this.b.size();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e042797960875b68c554a3ca33829a89", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e042797960875b68c554a3ca33829a89")).intValue();
            }
            h hVar = this.b.get(i);
            if (hVar.g) {
                return 0;
            }
            return ((MMPAuthGroup) hVar).i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b468fa39fbcb182114f6d1a97ee613bf", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b468fa39fbcb182114f6d1a97ee613bf");
            }
            if (this.b == null || this.b.get(i) == null) {
                return null;
            }
            h hVar = this.b.get(i);
            C0395a c0395a = new C0395a();
            int itemViewType = getItemViewType(i);
            if (view == null) {
                if (itemViewType == 1) {
                    inflate = SettingDialog.this.getLayoutInflater().inflate(R.layout.mmp_dialog_list_item_background, viewGroup, false);
                    c0395a.a = (TextView) inflate.findViewById(R.id.mmp_setting_item_name);
                    c0395a.b = (TextView) inflate.findViewById(R.id.mmp_setting_item_state);
                } else {
                    inflate = SettingDialog.this.getLayoutInflater().inflate(R.layout.mmp_dialog_list_item_general, viewGroup, false);
                    c0395a.a = (TextView) inflate.findViewById(R.id.mmp_setting_item_name);
                    c0395a.c = (CheckBox) inflate.findViewById(R.id.mmp_setting_item_radio);
                }
                view = inflate;
                view.setTag(c0395a);
            } else {
                c0395a = (C0395a) view.getTag();
            }
            if (itemViewType == 0) {
                SettingDialog.a(SettingDialog.this, hVar, c0395a);
            } else if (itemViewType == 1) {
                SettingDialog.a(SettingDialog.this, hVar, c0395a, view);
            }
            return view;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.meituan.mmp.lib.api.auth.SettingDialog$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0395a {
            public TextView a;
            public TextView b;
            public CheckBox c;

            private C0395a() {
            }
        }
    }

    private List<h> a(Map<String, Boolean> map) {
        boolean z;
        boolean z2;
        char c = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae4e0ca47e138c254d7a27df6a083b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae4e0ca47e138c254d7a27df6a083b0");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            Object[] objArr2 = new Object[1];
            objArr2[c] = key;
            ChangeQuickRedirect changeQuickRedirect2 = h.d;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7ad9b5829e43882af51c929830e9dfc5", RobustBitConfig.DEFAULT_VALUE)) {
                char c2 = 65535;
                int hashCode = key.hashCode();
                if (hashCode != -653473286) {
                    if (hashCode == 421939912 && key.equals("scope.userLocationBackground")) {
                        c2 = 1;
                    }
                } else if (key.equals("scope.userLocation")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                    case 1:
                        z = false;
                        break;
                    default:
                        z = true;
                        break;
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7ad9b5829e43882af51c929830e9dfc5")).booleanValue();
            }
            if (z) {
                h hVar = new h(entry.getKey(), entry.getValue().booleanValue());
                hVar.g = true;
                arrayList.add(hVar);
            } else {
                MMPAuthGroup mMPAuthGroup = null;
                for (int i = 0; i < arrayList2.size(); i++) {
                    MMPAuthGroup mMPAuthGroup2 = (MMPAuthGroup) arrayList2.get(i);
                    String key2 = entry.getKey();
                    Object[] objArr3 = {mMPAuthGroup2, key2};
                    ChangeQuickRedirect changeQuickRedirect3 = MMPAuthGroup.h;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c1ee3273b381865803ea921d62c3d932", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c1ee3273b381865803ea921d62c3d932")).booleanValue();
                    } else {
                        z2 = mMPAuthGroup2.i == MMPAuthGroup.a(key2);
                    }
                    if (z2) {
                        mMPAuthGroup = (MMPAuthGroup) arrayList2.remove(i);
                    }
                }
                if (mMPAuthGroup == null) {
                    String key3 = entry.getKey();
                    Object[] objArr4 = {key3, Byte.valueOf(entry.getValue().booleanValue() ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect4 = MMPAuthGroup.h;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0a9006b15d59e0672a252a7d3d25fe47", RobustBitConfig.DEFAULT_VALUE)) {
                        mMPAuthGroup = (MMPAuthGroup) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0a9006b15d59e0672a252a7d3d25fe47");
                    } else {
                        if (MMPAuthGroup.a(key3) == 1) {
                            mMPAuthGroup = new ForegroundAndBackgroundAuthGroup();
                        } else {
                            mMPAuthGroup = new MMPAuthGroup();
                        }
                        mMPAuthGroup.i = MMPAuthGroup.a(key3);
                    }
                }
                mMPAuthGroup.j.add(new h(entry.getKey(), entry.getValue().booleanValue()));
                mMPAuthGroup.g = false;
                arrayList2.add(mMPAuthGroup);
            }
            c = 0;
        }
        if (arrayList2.size() != 0) {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
