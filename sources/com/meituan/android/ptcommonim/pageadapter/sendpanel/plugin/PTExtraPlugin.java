package com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.xm.base.callback.c;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.event.d;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTExtraPlugin extends ExtraPlugin {
    public static ChangeQuickRedirect a;
    private final c<d> c;

    public PTExtraPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f49194d173f297084f095a5ad4041e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f49194d173f297084f095a5ad4041e7");
        } else {
            this.c = new c<d>() { // from class: com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin.PTExtraPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.c
                public final /* synthetic */ boolean a(d dVar) {
                    d dVar2 = dVar;
                    Object[] objArr2 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f4ec5a352afff88bfa8d96983679f2e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f4ec5a352afff88bfa8d96983679f2e")).booleanValue();
                    }
                    List<Plugin> a2 = dVar2 != null ? dVar2.a() : null;
                    if (!CollectionUtils.isEmpty(a2)) {
                        for (Plugin plugin : a2) {
                            if (plugin != null) {
                                Context context2 = PTExtraPlugin.this.getContext();
                                CharSequence name = plugin.getName();
                                Object[] objArr3 = {context2, name};
                                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fcc74d13d3338c552f042dde892146ba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fcc74d13d3338c552f042dde892146ba");
                                } else {
                                    Map<String, Object> a3 = f.a(context2);
                                    a3.put("button_name", name);
                                    Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_fp6mu65y_mv", a3, "c_group_hjkzttqg");
                                }
                            }
                        }
                    }
                    return false;
                }
            };
        }
    }

    public PTExtraPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bec575ad9eacb510dcb0d138976494", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bec575ad9eacb510dcb0d138976494");
        } else {
            this.c = new c<d>() { // from class: com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin.PTExtraPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.c
                public final /* synthetic */ boolean a(d dVar) {
                    d dVar2 = dVar;
                    Object[] objArr2 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f4ec5a352afff88bfa8d96983679f2e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f4ec5a352afff88bfa8d96983679f2e")).booleanValue();
                    }
                    List<Plugin> a2 = dVar2 != null ? dVar2.a() : null;
                    if (!CollectionUtils.isEmpty(a2)) {
                        for (Plugin plugin : a2) {
                            if (plugin != null) {
                                Context context2 = PTExtraPlugin.this.getContext();
                                CharSequence name = plugin.getName();
                                Object[] objArr3 = {context2, name};
                                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fcc74d13d3338c552f042dde892146ba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fcc74d13d3338c552f042dde892146ba");
                                } else {
                                    Map<String, Object> a3 = f.a(context2);
                                    a3.put("button_name", name);
                                    Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_fp6mu65y_mv", a3, "c_group_hjkzttqg");
                                }
                            }
                        }
                    }
                    return false;
                }
            };
        }
    }

    public PTExtraPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1ee1a7c107ac2022f7445020b92545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1ee1a7c107ac2022f7445020b92545");
        } else {
            this.c = new c<d>() { // from class: com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin.PTExtraPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.c
                public final /* synthetic */ boolean a(d dVar) {
                    d dVar2 = dVar;
                    Object[] objArr2 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f4ec5a352afff88bfa8d96983679f2e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f4ec5a352afff88bfa8d96983679f2e")).booleanValue();
                    }
                    List<Plugin> a2 = dVar2 != null ? dVar2.a() : null;
                    if (!CollectionUtils.isEmpty(a2)) {
                        for (Plugin plugin : a2) {
                            if (plugin != null) {
                                Context context2 = PTExtraPlugin.this.getContext();
                                CharSequence name = plugin.getName();
                                Object[] objArr3 = {context2, name};
                                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fcc74d13d3338c552f042dde892146ba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fcc74d13d3338c552f042dde892146ba");
                                } else {
                                    Map<String, Object> a3 = f.a(context2);
                                    a3.put("button_name", name);
                                    Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_fp6mu65y_mv", a3, "c_group_hjkzttqg");
                                }
                            }
                        }
                    }
                    return false;
                }
            };
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080cb14202252b57ba358cad98a29551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080cb14202252b57ba358cad98a29551");
            return;
        }
        super.d();
        b b = b.b(getContext());
        if (b != null) {
            b.a(d.class, this.c, true);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e480166a89d951c06c535afa36efc71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e480166a89d951c06c535afa36efc71");
            return;
        }
        super.ae_();
        f.a(getContext(), getPluginName());
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6172ac2b1423395f13a2d8baa527e5f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6172ac2b1423395f13a2d8baa527e5f5");
            return;
        }
        super.e();
        b b = b.b(getContext());
        if (b != null) {
            b.a(d.class, this.c);
        }
    }
}
