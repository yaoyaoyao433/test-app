package com.meituan.msc.modules.api.auth;

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
import com.meituan.msc.modules.api.auth.ForegroundAndBackgroundAuthGroupSettingDialog;
import com.meituan.msc.modules.update.f;
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
    private final f b;
    private Context e;

    public static /* synthetic */ void a(SettingDialog settingDialog, final c cVar, a.C0452a c0452a) {
        Object[] objArr = {cVar, c0452a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, settingDialog, changeQuickRedirect, false, "165738d51dc0305ed4f4edc47e705257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, settingDialog, changeQuickRedirect, false, "165738d51dc0305ed4f4edc47e705257");
            return;
        }
        c0452a.a.setText(com.meituan.msc.modules.api.auth.a.a(cVar.e));
        c0452a.c.setChecked(cVar.f);
        c0452a.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.msc.modules.api.auth.SettingDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35a8cfbc027e64ca494a7c75987d5334", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35a8cfbc027e64ca494a7c75987d5334");
                } else {
                    com.meituan.msc.modules.api.auth.a.a(SettingDialog.this.e, SettingDialog.this.b.j(), cVar.e, z);
                }
            }
        });
    }

    public static /* synthetic */ void a(SettingDialog settingDialog, c cVar, a.C0452a c0452a, View view) {
        Object[] objArr = {cVar, c0452a, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, settingDialog, changeQuickRedirect, false, "25cd08c4ed13c827af1bd3aacf9a71e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, settingDialog, changeQuickRedirect, false, "25cd08c4ed13c827af1bd3aacf9a71e7");
            return;
        }
        final ForegroundAndBackgroundAuthGroup foregroundAndBackgroundAuthGroup = (ForegroundAndBackgroundAuthGroup) cVar;
        c0452a.a.setText(foregroundAndBackgroundAuthGroup.c());
        final TextView textView = c0452a.b;
        c0452a.b.setText(foregroundAndBackgroundAuthGroup.a());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.api.auth.SettingDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c160422dcbf693af059903f82eb995c5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c160422dcbf693af059903f82eb995c5");
                    return;
                }
                ForegroundAndBackgroundAuthGroupSettingDialog foregroundAndBackgroundAuthGroupSettingDialog = new ForegroundAndBackgroundAuthGroupSettingDialog(SettingDialog.this.e, SettingDialog.this.b, foregroundAndBackgroundAuthGroup);
                foregroundAndBackgroundAuthGroupSettingDialog.b = new ForegroundAndBackgroundAuthGroupSettingDialog.a() { // from class: com.meituan.msc.modules.api.auth.SettingDialog.2.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.api.auth.ForegroundAndBackgroundAuthGroupSettingDialog.a
                    public final void a(String str) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7f181c71d5d8d8d18438575f26ef0bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7f181c71d5d8d8d18438575f26ef0bc");
                        } else {
                            textView.setText(str);
                        }
                    }
                };
                foregroundAndBackgroundAuthGroupSettingDialog.show();
            }
        });
    }

    public SettingDialog(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "389798cbb6f770c47ad24a9c4f04e852", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "389798cbb6f770c47ad24a9c4f04e852");
            return;
        }
        this.e = context;
        this.b = fVar;
        String j = fVar.j();
        View inflate = LayoutInflater.from(context).inflate(R.layout.msc_setting_dialog, (ViewGroup) null);
        a(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.mmp_setting_title);
        ListView listView = (ListView) inflate.findViewById(R.id.mmp_setting_list);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mmp_setting_no_auth);
        Map<String, Boolean> a2 = com.meituan.msc.modules.api.auth.a.a(context, j);
        a aVar = new a(a(a2));
        if (a2.size() == 0) {
            textView.setVisibility(8);
            listView.setVisibility(8);
            textView2.setText(fVar.k() + "未使用你的任何信息");
            return;
        }
        textView2.setVisibility(8);
        textView.setText(CommonConstant.Symbol.DOUBLE_QUOTES + fVar.k() + "\"使用我的");
        listView.setAdapter((ListAdapter) aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        public List<c> b;

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

        public a(List<c> list) {
            Object[] objArr = {SettingDialog.this, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ff52821fe00689671d4f3cdf4a4e3a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ff52821fe00689671d4f3cdf4a4e3a");
            } else {
                this.b = list;
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6677705701173fa22c327f12998ea61f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6677705701173fa22c327f12998ea61f")).intValue() : this.b.size();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb46d16f0f3bbc3d7280becae880c780", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb46d16f0f3bbc3d7280becae880c780")).intValue();
            }
            c cVar = this.b.get(i);
            if (cVar.g) {
                return 0;
            }
            return ((MMPAuthGroup) cVar).i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e24cf2e8c8fdf63bf5bf913da308529", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e24cf2e8c8fdf63bf5bf913da308529");
            }
            if (this.b == null || this.b.get(i) == null) {
                return null;
            }
            c cVar = this.b.get(i);
            C0452a c0452a = new C0452a();
            int itemViewType = getItemViewType(i);
            if (view == null) {
                if (itemViewType == 1) {
                    inflate = SettingDialog.this.getLayoutInflater().inflate(R.layout.msc_dialog_list_item_background, viewGroup, false);
                    c0452a.a = (TextView) inflate.findViewById(R.id.mmp_setting_item_name);
                    c0452a.b = (TextView) inflate.findViewById(R.id.mmp_setting_item_state);
                } else {
                    inflate = SettingDialog.this.getLayoutInflater().inflate(R.layout.msc_dialog_list_item_general, viewGroup, false);
                    c0452a.a = (TextView) inflate.findViewById(R.id.mmp_setting_item_name);
                    c0452a.c = (CheckBox) inflate.findViewById(R.id.mmp_setting_item_radio);
                }
                view = inflate;
                view.setTag(c0452a);
            } else {
                c0452a = (C0452a) view.getTag();
            }
            if (itemViewType == 0) {
                SettingDialog.a(SettingDialog.this, cVar, c0452a);
            } else if (itemViewType == 1) {
                SettingDialog.a(SettingDialog.this, cVar, c0452a, view);
            }
            return view;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.meituan.msc.modules.api.auth.SettingDialog$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0452a {
            public TextView a;
            public TextView b;
            public CheckBox c;

            private C0452a() {
            }
        }
    }

    private List<c> a(Map<String, Boolean> map) {
        boolean z;
        boolean z2;
        char c = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3ac41c490b5024c63a3710bc0f25da0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3ac41c490b5024c63a3710bc0f25da0");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            Object[] objArr2 = new Object[1];
            objArr2[c] = key;
            ChangeQuickRedirect changeQuickRedirect2 = c.d;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fef52ddf4dec990a641b440925c2ccf5", RobustBitConfig.DEFAULT_VALUE)) {
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
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fef52ddf4dec990a641b440925c2ccf5")).booleanValue();
            }
            if (z) {
                c cVar = new c(entry.getKey(), entry.getValue().booleanValue());
                cVar.g = true;
                arrayList.add(cVar);
            } else {
                MMPAuthGroup mMPAuthGroup = null;
                for (int i = 0; i < arrayList2.size(); i++) {
                    MMPAuthGroup mMPAuthGroup2 = (MMPAuthGroup) arrayList2.get(i);
                    String key2 = entry.getKey();
                    Object[] objArr3 = {mMPAuthGroup2, key2};
                    ChangeQuickRedirect changeQuickRedirect3 = MMPAuthGroup.h;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9248903737342271b5d5005aa7f7bce9", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9248903737342271b5d5005aa7f7bce9")).booleanValue();
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
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b63980199e4e77de138d8f39fb79d36f", RobustBitConfig.DEFAULT_VALUE)) {
                        mMPAuthGroup = (MMPAuthGroup) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b63980199e4e77de138d8f39fb79d36f");
                    } else {
                        if (MMPAuthGroup.a(key3) == 1) {
                            mMPAuthGroup = new ForegroundAndBackgroundAuthGroup();
                        } else {
                            mMPAuthGroup = new MMPAuthGroup();
                        }
                        mMPAuthGroup.i = MMPAuthGroup.a(key3);
                    }
                }
                mMPAuthGroup.j.add(new c(entry.getKey(), entry.getValue().booleanValue()));
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
