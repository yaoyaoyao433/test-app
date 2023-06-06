package com.sankuai.waimai.launcher.util.image;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.listener.a;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.squareup.okhttp.s;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.sankuai.meituan.mtimageloader.listener.a {
    public static ChangeQuickRedirect a;
    HashMap<String, String> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64017b6cf73e26b352c764267847f52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64017b6cf73e26b352c764267847f52");
        } else {
            this.b = new HashMap<>();
        }
    }

    @Override // com.sankuai.meituan.mtimageloader.listener.a
    public final void a(final com.sankuai.meituan.mtimageloader.config.b bVar, final a.InterfaceC0609a interfaceC0609a) {
        Object[] objArr = {bVar, interfaceC0609a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26f39697c204e092997b25a2a2c8ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26f39697c204e092997b25a2a2c8ba5");
        } else if ((bVar.a() instanceof Activity) && (((Activity) bVar.a()).isFinishing() || ((Activity) bVar.a()).isDestroyed())) {
            interfaceC0609a.a(false);
            i.d(new com.sankuai.waimai.launcher.log.a().a("weaknet_image_load_after_destroy").b(bVar.a().getClass().getName()).c(bVar.b).d(Log.getStackTraceString(new Exception())).b());
        } else if (bVar.z) {
            interfaceC0609a.a(false);
        } else {
            ImageView imageView = bVar.h;
            final String valueOf = imageView != null ? String.valueOf(imageView.hashCode()) : "";
            if (!TextUtils.isEmpty(valueOf)) {
                this.b.remove(valueOf);
            }
            if (TextUtils.isEmpty(bVar.c) || TextUtils.isEmpty(bVar.b)) {
                interfaceC0609a.a(false);
            } else if (!bVar.s && !bVar.r) {
                interfaceC0609a.a(false);
            } else {
                com.sankuai.waimai.platform.net.a aVar = com.sankuai.waimai.platform.net.d.a().e;
                if (aVar != com.sankuai.waimai.platform.net.a.POOR && aVar != com.sankuai.waimai.platform.net.a.GOOD) {
                    interfaceC0609a.a(false);
                    return;
                }
                f a2 = g.a();
                if (a2 == null) {
                    interfaceC0609a.a(false);
                    return;
                }
                String str = bVar.b;
                s a3 = g.a(str, a2, bVar.a());
                final String a4 = g.a(str, a3, aVar, a2, bVar.h);
                List<String> b = g.b(str, a3, aVar, a2, bVar.h);
                if (b != null && b.size() != 0) {
                    if (!TextUtils.isEmpty(valueOf)) {
                        this.b.put(valueOf, bVar.c);
                    }
                    final long b2 = com.meituan.android.time.c.b();
                    a(bVar, b, 0, new a.InterfaceC0609a() { // from class: com.sankuai.waimai.launcher.util.image.e.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.listener.a.InterfaceC0609a
                        public final void a(boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94204a3c5b58da7faa22c2a3793afb38", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94204a3c5b58da7faa22c2a3793afb38");
                            } else if (TextUtils.isEmpty(valueOf) || bVar.c.equals(e.this.b.get(valueOf))) {
                                int b3 = (int) (com.meituan.android.time.c.b() - b2);
                                if (!z) {
                                    bVar.b = a4;
                                }
                                if (!TextUtils.isEmpty(valueOf)) {
                                    e.this.b.remove(valueOf);
                                }
                                interfaceC0609a.a(z);
                                com.sankuai.waimai.platform.capacity.log.c.a().a(z ? 1000 : 2000, b3, "waimai_network_weak_pic_cache");
                            }
                        }
                    });
                    return;
                }
                bVar.b = a4;
                interfaceC0609a.a(false);
            }
        }
    }

    void a(final com.sankuai.meituan.mtimageloader.config.b bVar, final List<String> list, final int i, final a.InterfaceC0609a interfaceC0609a) {
        Object[] objArr = {bVar, list, Integer.valueOf(i), interfaceC0609a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27f5c2e1b5a9e4a1e55971712143c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27f5c2e1b5a9e4a1e55971712143c88");
        } else if (list == null || list.isEmpty() || list.size() <= i || TextUtils.isEmpty(list.get(i))) {
            interfaceC0609a.a(false);
        } else if (i > 0 && (bVar.a() instanceof Activity) && (((Activity) bVar.a()).isFinishing() || ((Activity) bVar.a()).isDestroyed())) {
            interfaceC0609a.a(false);
            a.AbstractC1040a c = new com.sankuai.waimai.launcher.log.a().a("weaknet_image_load_after_destroy").b(bVar.a().getClass().getName()).c(bVar.b);
            i.d(c.d("retry at " + i).b());
        } else {
            String valueOf = bVar.h != null ? String.valueOf(bVar.h.hashCode()) : "";
            if (!TextUtils.isEmpty(valueOf) && !bVar.c.equals(this.b.get(valueOf))) {
                interfaceC0609a.a(false);
                return;
            }
            bVar.b = list.get(i);
            RequestCreator a2 = a(bVar);
            if (a2 == null) {
                interfaceC0609a.a(false);
                return;
            }
            a2.l = true;
            a2.s = new RequestListener() { // from class: com.sankuai.waimai.launcher.util.image.e.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Exception exc, Object obj, boolean z) {
                    Object[] objArr2 = {exc, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e929888c4deb415f6ee3d8642e84b8c9", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e929888c4deb415f6ee3d8642e84b8c9")).booleanValue();
                    }
                    e.this.a(bVar, list, i + 1, interfaceC0609a);
                    return true;
                }

                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Object obj, Object obj2, boolean z, boolean z2) {
                    Object[] objArr2 = {obj, obj2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a83255aacf0b8abb5cc14886fd9e90c8", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a83255aacf0b8abb5cc14886fd9e90c8")).booleanValue();
                    }
                    interfaceC0609a.a(bVar.h != null);
                    return false;
                }
            };
            if (bVar.h != null) {
                a2.a(bVar.h);
            } else {
                a2.k();
            }
        }
    }

    private RequestCreator a(com.sankuai.meituan.mtimageloader.config.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bdae7afe1ec1b1ba5ec55cbfb72e95c", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bdae7afe1ec1b1ba5ec55cbfb72e95c");
        }
        RequestCreator b = b(bVar);
        if (b == null) {
            return null;
        }
        a(bVar, b);
        if (bVar.q > 0) {
            b.g = bVar.q;
        }
        if (bVar.w > 0 && bVar.x > 0) {
            b.b(bVar.w, bVar.x);
        }
        if (!bVar.s) {
            b.a(true);
        }
        if (bVar.r) {
            b.k = DiskCacheStrategy.ALL;
        } else {
            b.k = DiskCacheStrategy.NONE;
        }
        return b;
    }

    private RequestCreator b(com.sankuai.meituan.mtimageloader.config.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1ab7d05a53bb614c921037fc9b44ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1ab7d05a53bb614c921037fc9b44ac");
        }
        Picasso g = Picasso.g(com.sankuai.meituan.mtimageloader.config.a.a());
        HashMap<String, String> hashMap = bVar.y;
        if (hashMap != null && !hashMap.isEmpty()) {
            if (com.sankuai.meituan.mtimageloader.config.a.i()) {
                throw new UnsupportedOperationException("MTPicasso不支持自定义Header");
            }
            return null;
        }
        RequestCreator d = g.d(bVar.b);
        d.p = bVar.a();
        return d;
    }

    private void a(com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1710a1101d9fe3e2743572c2cf3bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1710a1101d9fe3e2743572c2cf3bc3");
            return;
        }
        switch (bVar.l) {
            case 1:
                requestCreator.a(Picasso.Priority.LOW);
                return;
            case 2:
                requestCreator.a(Picasso.Priority.NORMAL);
                return;
            case 3:
                requestCreator.a(Picasso.Priority.HIGH);
                return;
            case 4:
                requestCreator.a(Picasso.Priority.IMMEDIATE);
                return;
            default:
                requestCreator.a(Picasso.Priority.IMMEDIATE);
                return;
        }
    }
}
