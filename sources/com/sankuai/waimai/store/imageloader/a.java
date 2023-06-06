package com.sankuai.waimai.store.imageloader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.o;
import com.sankuai.waimai.store.imageloader.ImageLoaderMonitor;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @SuppressLint({"CheckResult"})
    public static b.C0608b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2131c3914a92c1c3807f45ee8c3bc49", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2131c3914a92c1c3807f45ee8c3bc49") : new C1214a().a(new b(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.imageloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1214a extends b.C0608b {
        public static ChangeQuickRedirect n;
        private final List<b.d> o;

        @SuppressLint({"CheckResult"})
        public C1214a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = n;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94e6516cf8a5c7f8befa0b71b2ca710", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94e6516cf8a5c7f8befa0b71b2ca710");
                return;
            }
            this.o = new ArrayList();
            super.a(new b.d() { // from class: com.sankuai.waimai.store.imageloader.a.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a14b51b3516f4ff655d1aa9ffb65b89e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a14b51b3516f4ff655d1aa9ffb65b89e");
                        return;
                    }
                    for (b.d dVar : C1214a.this.o) {
                        if (dVar != null) {
                            dVar.a();
                        }
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89ad66bd3c4d25a10e645fd88a1ed5a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89ad66bd3c4d25a10e645fd88a1ed5a8");
                        return;
                    }
                    for (b.d dVar : C1214a.this.o) {
                        if (dVar != null) {
                            dVar.a(i, exc);
                        }
                    }
                }
            });
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.C0608b
        @NonNull
        public final b.C0608b a(b.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = n;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ebad0512128c512d0b91a5f6fc437a3", RobustBitConfig.DEFAULT_VALUE)) {
                return (b.C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ebad0512128c512d0b91a5f6fc437a3");
            }
            if (!this.o.contains(dVar)) {
                this.o.add(dVar);
            }
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements b.d {
        public static ChangeQuickRedirect a;
        @Nullable
        private final String b;

        @Override // com.sankuai.meituan.mtimageloader.config.b.d
        public final void a() {
        }

        private b(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13acd27371c6c7b04d25917cd93027e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13acd27371c6c7b04d25917cd93027e");
            } else {
                this.b = str;
            }
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.d
        public final void a(int i, Exception exc) {
            Object[] objArr = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28dc13f5c8a18d3833f0ac52a52a807", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28dc13f5c8a18d3833f0ac52a52a807");
                return;
            }
            ImageLoaderMonitor a2 = ImageLoaderMonitor.a();
            String str = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = ImageLoaderMonitor.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e2954561b7a78e63d8cf8b8d8997db2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e2954561b7a78e63d8cf8b8d8997db2d");
                return;
            }
            Context a3 = com.sankuai.waimai.store.util.b.a();
            if (a3 == null || o.a(a3) || TextUtils.isEmpty(str)) {
                return;
            }
            List<ImageLoaderMonitor.a> list = a2.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                a2.b.put(str, list);
            }
            list.add(new ImageLoaderMonitor.a(str));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = ImageLoaderMonitor.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f92c46043948bfb8de23e949b50f165a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f92c46043948bfb8de23e949b50f165a");
            } else {
                List<ImageLoaderMonitor.a> a4 = a2.a(a2.b);
                if (a4.size() >= a2.c && a2.a(a4)) {
                    ArrayList arrayList = new ArrayList(a2.b.keySet());
                    ImageLoaderMonitor.ImageLoaderIMonitor imageLoaderIMonitor = ImageLoaderMonitor.ImageLoaderIMonitor.Exception;
                    String a5 = i.a(arrayList);
                    c.a(imageLoaderIMonitor, a5, ((a2.d / 60) / 1000) + "分钟失败的图片次数大于" + a2.c + "次");
                    a2.b.clear();
                }
            }
            a2.c();
            a2.b();
        }
    }
}
