package com.sankuai.waimai.popup;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMUpdatePopup extends WMBasePopup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mIsShowing;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public WMUpdatePopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82c3bc1c799428f7596c08768f199b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82c3bc1c799428f7596c08768f199b9b");
        } else {
            this.mIsShowing = false;
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f50ab1e5f2d0c0744e9bfd6f31133fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f50ab1e5f2d0c0744e9bfd6f31133fa");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5133d91447561f98460a5e14128af87f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5133d91447561f98460a5e14128af87f");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8d1863438723128cb78ad2aed65e87e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8d1863438723128cb78ad2aed65e87e")).booleanValue();
        }
        com.sankuai.waimai.platform.popup.d a2 = com.sankuai.waimai.platform.popup.d.a();
        StringBuilder sb = new StringBuilder("update popup shouldSendToNext:");
        sb.append(!this.mIsShowing);
        a2.b(sb.toString());
        return !this.mIsShowing;
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d6760e67f91521ee1bd9c61b4a4d23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d6760e67f91521ee1bd9c61b4a4d23")).booleanValue();
        }
        Activity activity = getContext().a.get();
        if (activity == null) {
            return super.shouldHandle(bVar);
        }
        com.sankuai.waimai.platform.popup.d a2 = com.sankuai.waimai.platform.popup.d.a();
        StringBuilder sb = new StringBuilder("update popup shouldHandle:");
        sb.append(!e.a((Context) activity));
        a2.b(sb.toString());
        return !e.a((Context) activity);
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, final b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3425babd26d17d193494afe5bd98a9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3425babd26d17d193494afe5bd98a9a");
            return;
        }
        final a aVar2 = new a() { // from class: com.sankuai.waimai.popup.WMUpdatePopup.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.popup.WMUpdatePopup.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7932530fb3948ce8b0478f4008c5f9e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7932530fb3948ce8b0478f4008c5f9e4");
                    return;
                }
                WMUpdatePopup.this.mIsShowing = true;
                aVar.a(false);
            }

            @Override // com.sankuai.waimai.popup.WMUpdatePopup.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a4a5dac5120851f0f2e360aafe564c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a4a5dac5120851f0f2e360aafe564c8");
                    return;
                }
                WMUpdatePopup.this.mIsShowing = false;
                aVar.a(true);
            }
        };
        Object[] objArr2 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.manager.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2d3229eeda05534f7329e69d5aa8324d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2d3229eeda05534f7329e69d5aa8324d");
            return;
        }
        final com.sankuai.waimai.business.page.homepage.manager.c a2 = com.sankuai.waimai.business.page.homepage.manager.c.a();
        Object[] objArr3 = {(byte) 1, aVar2};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.manager.c.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "45502c14057b212ed4837e0872a23615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "45502c14057b212ed4837e0872a23615");
        } else if (a2.a(a2.c())) {
        } else {
            a2.a(new com.meituan.android.uptodate.interfac.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.8
                public static ChangeQuickRedirect a;
                private int f = 0;

                @Override // com.meituan.android.uptodate.interfac.a
                public final void a(VersionInfo versionInfo) {
                    Object[] objArr4 = {versionInfo};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "be31acb145e387e5575e915e8aa3b789", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "be31acb145e387e5575e915e8aa3b789");
                    } else if (versionInfo != null) {
                        com.sankuai.waimai.platform.widget.dialog.a.b(r2);
                        if (versionInfo.forceupdate != 1) {
                            aVar2.b();
                        }
                        if (!versionInfo.isUpdated || com.sankuai.waimai.platform.b.A().j() >= versionInfo.currentVersion || (TextUtils.isEmpty(versionInfo.appurl) && TextUtils.isEmpty(versionInfo.appHttpsUrl))) {
                            if (r4) {
                                return;
                            }
                            ae.a(a2.d, (int) R.string.wm_page_upgrade_was_latest_version);
                            return;
                        }
                        a2.c.b = new com.meituan.android.uptodate.interfac.c() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.8.1
                            public static ChangeQuickRedirect a;

                            {
                                AnonymousClass8.this = this;
                            }

                            @Override // com.meituan.android.uptodate.interfac.c
                            public final void a(int i, VersionInfo versionInfo2, Exception exc) {
                                Object[] objArr5 = {Integer.valueOf(i), versionInfo2, exc};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "999f70da568d121384df321160cf354b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "999f70da568d121384df321160cf354b");
                                } else {
                                    c.a(a2, i, versionInfo2, r4);
                                }
                            }

                            @Override // com.meituan.android.uptodate.interfac.c
                            public final boolean a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "40d8462a282e13913b87f63d8a9dc5b5", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "40d8462a282e13913b87f63d8a9dc5b5")).booleanValue();
                                }
                                if (com.sankuai.waimai.foundation.core.a.b()) {
                                    return true;
                                }
                                boolean a3 = a2.a(a2.d, "638c81261479c2104ede3f2518e91725");
                                if (!a3) {
                                    c.b(a2.c());
                                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("apk_upgrade").b("sign_invalid").b());
                                }
                                return a3;
                            }

                            @Override // com.meituan.android.uptodate.interfac.c
                            public final void a(long j, long j2) {
                                Object[] objArr5 = {new Long(j), new Long(j2)};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "d2e5f03d77f832290ff97176fdd81e96", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "d2e5f03d77f832290ff97176fdd81e96");
                                    return;
                                }
                                aVar2.a();
                                a2.i = j2;
                                int i = (int) ((((float) j) / ((float) j2)) * 100.0f);
                                if (a2.b != null) {
                                    a2.b.a(i);
                                }
                                if (a2.j) {
                                    return;
                                }
                                a2.h = i;
                                a2.a(a2.h);
                            }
                        };
                        a2.c.a(versionInfo, "638c81261479c2104ede3f2518e91725");
                    } else {
                        if (!r4) {
                            ae.a(a2.d, (int) R.string.wm_page_main_toast_checkUpdateFailed);
                        }
                        com.sankuai.waimai.platform.widget.dialog.a.b(r2);
                        aVar2.b();
                    }
                }
            });
        }
    }
}
