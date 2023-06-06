package com.meituan.android.mrn.container;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.mrn.config.q;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.h;
import com.meituan.android.mrn.engine.j;
import com.meituan.android.mrn.update.ResponseBundle;
import com.meituan.android.mrn.update.d;
import com.meituan.android.mrn.update.k;
import com.meituan.android.mrn.utils.ai;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String b = "MRNBundleGetter";
    private String c;
    private String d;
    private String e;
    private boolean f;
    private b g;
    private com.meituan.android.mrn.container.a h;
    private com.meituan.android.mrn.update.d i;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public void a(q qVar, Throwable th, String str) {
        }

        public void a(com.meituan.android.mrn.engine.e eVar, int i) {
        }
    }

    public d(String str, String str2, b bVar) {
        this(str, str2, bVar, true);
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee618216f800aebdb2aea9a9e81b30c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee618216f800aebdb2aea9a9e81b30c");
        }
    }

    public d(String str, String str2, b bVar, boolean z) {
        Object[] objArr = {str, str2, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23d55cfcea109f885771add66cf8029", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23d55cfcea109f885771add66cf8029");
            return;
        }
        this.i = new com.meituan.android.mrn.update.d() { // from class: com.meituan.android.mrn.container.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.update.d
            public final void a(@NonNull d.b bVar2) {
            }

            @Override // com.meituan.android.mrn.update.d
            public final void a(@NonNull d.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb13374e5195c0238ef36b9b5250179d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb13374e5195c0238ef36b9b5250179d");
                } else if (d.this.h != null) {
                    com.meituan.android.mrn.container.a unused = d.this.h;
                    String unused2 = d.this.c;
                }
            }

            @Override // com.meituan.android.mrn.update.d
            public final void a(@NonNull d.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ff93c1a6d83e7f0b3833dbbec6da653", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ff93c1a6d83e7f0b3833dbbec6da653");
                } else if (d.this.h != null) {
                    com.meituan.android.mrn.container.a unused = d.this.h;
                    String unused2 = d.this.c;
                }
            }
        };
        this.c = str;
        this.d = str2;
        this.g = bVar;
        this.f = z;
        this.e = MRNBundleManager.sharedInstance().getPresetVersion(str);
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24227a4e81554d8f3cb4cad5aee3fc73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24227a4e81554d8f3cb4cad5aee3fc73");
        } else if (TextUtils.isEmpty(this.c)) {
            throw new j("bundleName should not be null");
        } else {
            com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + ":runBundleIfNeed " + this.c + StringUtil.SPACE + this.d + StringUtil.SPACE + this.e);
            MRNBundleManager sharedInstance = MRNBundleManager.sharedInstance();
            if (z) {
                k.a().a(this.c, true, (com.meituan.android.mrn.update.d) b(false), this.f);
                com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + ":runBundleIfNeed，强制更新");
                return;
            }
            com.meituan.android.mrn.engine.e bundle = sharedInstance.getBundle(this.c);
            if (h.a(bundle)) {
                com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包 " + bundle.f);
                if (a(bundle.f, this.d) && a(bundle.f, this.e)) {
                    com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，且包版本比预置包版本和用户设置最低版本高，直接使用");
                    this.g.a(bundle, 0);
                    if (!a(bundle)) {
                        com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，且包版本比预置包版本和用户设置最低版本高，直接使用，后台下载最新包");
                        k.a().a(this.c, false, this.i, false);
                        if (this.h != null) {
                        }
                    } else if (this.h != null) {
                    }
                } else if (!a(bundle.f, this.e) && a(this.e, this.d)) {
                    com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，且包版本<presetVersion，且presetVersion>minVersion，需要解压预置包");
                    if (com.meituan.android.mrn.config.horn.k.b.a(this.c) && !a(this.c)) {
                        com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，且包版本<presetVersion，且presetVersion>minVersion，需要解压预置包，预置包优先，解压");
                        if (sharedInstance.installBundleFromAssetsSync(sharedInstance.getBusinessAssetsBundleName(this.c))) {
                            com.meituan.android.mrn.engine.e bundle2 = MRNBundleManager.sharedInstance().getBundle(this.c, this.e);
                            if (h.a(bundle2)) {
                                this.g.a(bundle2, 2);
                            }
                            if (!a(bundle2)) {
                                com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，且包版本<presetVersion，且presetVersion>minVersion，需要解压预置包，预置包优先，解压，后台下载最新版本");
                                k.a().a(this.c, false, this.i, false);
                            }
                        } else {
                            this.g.a(q.LOAD_MAIN_BUNDLE_FAILED, null, null);
                        }
                    } else {
                        com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，且包版本<presetVersion，且presetVersion>minVersion，需要解压预置包，优先下载，单包更新，用预置包兜底");
                        k.a().a(this.c, TextUtils.isEmpty(this.d) ^ true, b(true), this.f);
                    }
                } else {
                    com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地有有效包，其他情况，单包更新，不需要预置包兜底");
                    k.a().a(this.c, TextUtils.isEmpty(this.d) ^ true, b(true), this.f);
                }
            } else if (a(this.e, this.d) && com.meituan.android.mrn.config.horn.k.b.a(this.c) && !a(this.c)) {
                MRNBundleManager.AssetsBundle businessAssetsBundleName = sharedInstance.getBusinessAssetsBundleName(this.c);
                com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地没有有效包，且presetVersion>minVersion，且预置包优先，解压预置包");
                if (sharedInstance.installBundleFromAssetsSync(businessAssetsBundleName)) {
                    com.meituan.android.mrn.engine.e bundle3 = MRNBundleManager.sharedInstance().getBundle(this.c, this.e);
                    if (h.a(bundle3)) {
                        this.g.a(bundle3, 2);
                    }
                    if (!a(bundle3)) {
                        com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地没有有效包，且presetVersion>minVersion，且预置包优先，解压预置包，后台更新");
                        k.a().a(this.c, false, this.i, false);
                    }
                } else {
                    this.g.a(q.LOAD_MAIN_BUNDLE_FAILED, null, null);
                }
            } else {
                com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", b + "本地没有有效包，单包更新");
                k.a().a(this.c, true, (com.meituan.android.mrn.update.d) b(true), this.f);
            }
        }
    }

    private a b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed03a6d6b4da439a369d5b3a0c90e74", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed03a6d6b4da439a369d5b3a0c90e74") : new a(z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements com.meituan.android.mrn.update.d {
        public static ChangeQuickRedirect a;
        private double c;
        private boolean d;

        public a(boolean z) {
            Object[] objArr = {d.this, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a492ab3d1a045bcf2a0ff7fb9a78635c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a492ab3d1a045bcf2a0ff7fb9a78635c");
            } else {
                this.d = z;
            }
        }

        @Override // com.meituan.android.mrn.update.d
        public final void a(@NonNull d.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3301c91f65ed9700227decfbd809ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3301c91f65ed9700227decfbd809ef");
            } else {
                this.c = com.meituan.hotel.android.hplus.diagnoseTool.a.a();
            }
        }

        @Override // com.meituan.android.mrn.update.d
        public final void a(@NonNull final d.c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a7aeed48f7278bd10f4848919be6f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a7aeed48f7278bd10f4848919be6f8");
                return;
            }
            com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", d.b + "单包请求成功 " + cVar.c);
            if (!TextUtils.isEmpty(d.this.c)) {
                com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                String.format(DiagnoseLog.TASK_MRN_BUNDLE_DOWNLOAD_FORMAT, d.this.c);
                com.meituan.hotel.android.hplus.diagnoseTool.a.a();
            }
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.d.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17f8c6317f6f761f00da698f99890156", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17f8c6317f6f761f00da698f99890156");
                        return;
                    }
                    com.meituan.android.mrn.engine.e bundle = MRNBundleManager.sharedInstance().getBundle(d.this.c, cVar.c);
                    if (h.a(bundle)) {
                        d.this.g.a(bundle, 1);
                        return;
                    }
                    com.meituan.android.mrn.engine.e bundle2 = MRNBundleManager.sharedInstance().getBundle(d.this.c);
                    if (h.a(bundle2)) {
                        d.this.g.a(bundle2, 1);
                    } else {
                        d.this.g.a(q.BUNDLE_INCOMPLETE, null, null);
                    }
                }
            });
        }

        @Override // com.meituan.android.mrn.update.d
        public final void a(@NonNull final d.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fcaf734cf19eade257d430d59cba7bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fcaf734cf19eade257d430d59cba7bf");
                return;
            }
            com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", d.b + "单包请求失败 " + aVar.b);
            if (!TextUtils.isEmpty(d.this.c)) {
                com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                String.format(DiagnoseLog.TASK_MRN_BUNDLE_DOWNLOAD_FORMAT, d.this.c);
                com.meituan.hotel.android.hplus.diagnoseTool.a.a();
            }
            boolean hasDecompressPreset = MRNBundleManager.sharedInstance().hasDecompressPreset(d.this.c);
            if (this.d && d.a(d.this.e, d.this.d) && !com.meituan.android.mrn.config.horn.k.b.a(d.this.c) && !hasDecompressPreset) {
                final MRNBundleManager.AssetsBundle businessAssetsBundleName = MRNBundleManager.sharedInstance().getBusinessAssetsBundleName(d.this.c);
                ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.d.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f318dc2374510aa36d1b5c87cb17fc0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f318dc2374510aa36d1b5c87cb17fc0");
                        } else if (MRNBundleManager.sharedInstance().installBundleFromAssetsSync(businessAssetsBundleName)) {
                            d.this.g.a(MRNBundleManager.sharedInstance().getBundle(d.this.c), 2);
                        }
                    }
                });
                return;
            }
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.d.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a02f943311b5135b79c4fd55ab3e90e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a02f943311b5135b79c4fd55ab3e90e7");
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.c != null ? aVar.c.getMessage() : "unknown");
                    sb.append(StringUtil.SPACE);
                    sb.append(d.this.c);
                    sb.append(StringUtil.SPACE);
                    sb.append(aVar.b);
                    com.facebook.common.logging.a.b("[MRNBundleGetter@fetchBundle]", sb.toString());
                    com.meituan.android.mrn.engine.e bundle = MRNBundleManager.sharedInstance().getBundle(d.this.c);
                    if (bundle == null || !d.a(bundle.f, d.this.d) || !h.a(bundle)) {
                        d.this.g.a(aVar.c != null ? q.a(aVar.c.b) : q.DOWNLOAD_OR_UNZIP_FAILED, null, null);
                    } else {
                        d.this.g.a(bundle, 1);
                    }
                }
            });
        }
    }

    private boolean a(com.meituan.android.mrn.engine.e eVar) {
        ResponseBundle b2;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8cefcdcede3900da14a30a0a0a8fc30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8cefcdcede3900da14a30a0a0a8fc30")).booleanValue() : eVar == null || (b2 = com.meituan.android.mrn.update.j.b(eVar.c)) == null || TextUtils.equals(eVar.f, b2.version);
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d8754ac27d1fa97348ddb3ba5a32d34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d8754ac27d1fa97348ddb3ba5a32d34")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.isEmpty(str2) || com.meituan.android.mrn.utils.e.a(str, str2) >= 0;
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac496f91ad2c068f1556320225f5a5d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac496f91ad2c068f1556320225f5a5d")).booleanValue() : MRNBundleManager.sharedInstance().hasDecompressPreset(str);
    }
}
