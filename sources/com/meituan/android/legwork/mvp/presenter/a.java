package com.meituan.android.legwork.mvp.presenter;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.address.MtRevGeoBean;
import com.meituan.android.legwork.bean.address.PoiBean;
import com.meituan.android.legwork.bean.address.SmallGrainRegeoBean;
import com.meituan.android.legwork.common.jarvis.JarvisConfigChangeReceiver;
import com.meituan.android.legwork.common.jarvis.ScrollBarConfigBean;
import com.meituan.android.legwork.mvp.contract.a;
import com.meituan.android.legwork.net.response.MapBaseEntity;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.legwork.mvp.base.a<a.b> {
    public static ChangeQuickRedirect c;
    public a.InterfaceC0268a d;
    public JarvisConfigChangeReceiver e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e796c11adfbeb3ab3a7868dcd474af5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e796c11adfbeb3ab3a7868dcd474af5");
        } else {
            this.d = new com.meituan.android.legwork.mvp.model.a();
        }
    }

    public final void a(String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78bf046e59e521348cdc69adbf35e1a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78bf046e59e521348cdc69adbf35e1a6");
        } else if (c()) {
            a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<MapBaseEntity<MtRevGeoBean>>() { // from class: com.meituan.android.legwork.mvp.presenter.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(MapBaseEntity<MtRevGeoBean> mapBaseEntity) {
                    MapBaseEntity<MtRevGeoBean> mapBaseEntity2 = mapBaseEntity;
                    Object[] objArr2 = {mapBaseEntity2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9735e055ac8184a756e0bcb86adcc762", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9735e055ac8184a756e0bcb86adcc762");
                    } else if (a.this.c()) {
                        if (mapBaseEntity2 != null && mapBaseEntity2.status == 200 && mapBaseEntity2.result != null && mapBaseEntity2.result.pois != null && mapBaseEntity2.result.pois.size() > 0 && mapBaseEntity2.result.pois.get(0) != null) {
                            a.this.b().a(mapBaseEntity2.result.pois.get(0), z);
                        } else {
                            a(false, 100, "接口请求失败, 请重试");
                        }
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z2, int i, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58bfcaa9f2b423a58c70267224366193", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58bfcaa9f2b423a58c70267224366193");
                    } else if (a.this.c()) {
                        a.this.b().a(str2, z);
                    }
                }
            }, this.d.a(str).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    public final void b(String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8018ee3090bebf56ecb19edd76d5ea2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8018ee3090bebf56ecb19edd76d5ea2e");
        } else if (c()) {
            a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<SmallGrainRegeoBean>() { // from class: com.meituan.android.legwork.mvp.presenter.a.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(SmallGrainRegeoBean smallGrainRegeoBean) {
                    SmallGrainRegeoBean smallGrainRegeoBean2 = smallGrainRegeoBean;
                    Object[] objArr2 = {smallGrainRegeoBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bffbb7aa5b08dbfab5fcea09255b7d87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bffbb7aa5b08dbfab5fcea09255b7d87");
                    } else if (a.this.c()) {
                        if (smallGrainRegeoBean2 != null) {
                            PoiBean poiBean = new PoiBean();
                            poiBean.name = smallGrainRegeoBean2.name;
                            poiBean.address = smallGrainRegeoBean2.address;
                            StringBuilder sb = new StringBuilder();
                            sb.append(smallGrainRegeoBean2.lng / 1000000.0d);
                            poiBean.longitude = sb.toString();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(smallGrainRegeoBean2.lat / 1000000.0d);
                            poiBean.latitude = sb2.toString();
                            poiBean.location = poiBean.longitude + CommonConstant.Symbol.COMMA + poiBean.latitude;
                            a.this.b().a(poiBean, z);
                            return;
                        }
                        a(false, 100, "接口请求失败, 请重试");
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z2, int i, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5427d9d313e37246f27999f5216dc499", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5427d9d313e37246f27999f5216dc499");
                    } else if (a.this.c()) {
                        a.this.b().a(str2, z);
                    }
                }
            }, this.d.b(str).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    public final void d() {
        ScrollBarConfigBean scrollBarConfigBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc11577d3db63b0208f22d82227eb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc11577d3db63b0208f22d82227eb96");
        } else if (c() && com.meituan.android.legwork.common.util.a.a().c()) {
            Map<String, Object> a = this.d.a();
            if (a != null) {
                try {
                    scrollBarConfigBean = (ScrollBarConfigBean) com.meituan.android.legwork.net.util.b.a().fromJson(com.meituan.android.legwork.net.util.b.a().toJson(a), (Class<Object>) ScrollBarConfigBean.class);
                } catch (Exception e) {
                    x.c("AddressConfirmPresenter.getPageDowngradeConfig", "change map to bean exception" + e);
                    x.a(e);
                    scrollBarConfigBean = null;
                }
                if (scrollBarConfigBean != null) {
                    int parseColor = Color.parseColor("#FFFBF0");
                    if (scrollBarConfigBean.showStyle != null && !TextUtils.isEmpty(scrollBarConfigBean.showStyle.color)) {
                        try {
                            parseColor = Color.parseColor(scrollBarConfigBean.showStyle.color);
                        } catch (Exception e2) {
                            x.c("AddressConfirmPresenter.getPageDowngradeConfig", "get color exception" + e2);
                        }
                    }
                    b().a(true, scrollBarConfigBean.content, parseColor, scrollBarConfigBean.linkUrl);
                    return;
                }
                b().a(false, "", 0, "");
                return;
            }
            b().a(false, "", 0, "");
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727d0a0064b4474bc5793402548a4b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727d0a0064b4474bc5793402548a4b69");
        } else if (c() && com.meituan.android.legwork.common.util.a.a().c() && this.e == null) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            this.e = new JarvisConfigChangeReceiver(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb46067bda3eb12c4e275a269ec1b775", RobustBitConfig.DEFAULT_VALUE) ? (JarvisConfigChangeReceiver.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb46067bda3eb12c4e275a269ec1b775") : new b(this));
            JarvisConfigChangeReceiver jarvisConfigChangeReceiver = this.e;
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = JarvisConfigChangeReceiver.a;
            if (PatchProxy.isSupport(objArr3, jarvisConfigChangeReceiver, changeQuickRedirect3, false, "c98819bf0d6a8a9edbe766fedc55b450", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, jarvisConfigChangeReceiver, changeQuickRedirect3, false, "c98819bf0d6a8a9edbe766fedc55b450");
            } else if (context != null) {
                try {
                    context.registerReceiver(jarvisConfigChangeReceiver, new IntentFilter("paotui_c:degrade_info_changed"));
                } catch (Exception e) {
                    x.e("JarvisConfigChangeReceiver.register() 异常", "exception msg:", e);
                }
            }
        }
    }
}
