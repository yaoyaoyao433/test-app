package com.sankuai.waimai.store.im.base.mach;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.model.PicItemParam;
import com.meituan.android.ptcommonim.video.model.PicPreviewParam;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class IMJSEventHandler implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    public b b;
    public a c;
    public com.sankuai.xm.imui.session.entity.b<GeneralMessage> d;
    public View e;
    private com.sankuai.waimai.store.im.poi.contract.a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class JumpBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("append_params")
        public Map<String, String> append_params;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("scheme_type")
        public int scheme_ype;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(Map<String, Object> map);

        void a(Map<String, Object> map, com.sankuai.waimai.store.mach.event.a aVar);
    }

    public IMJSEventHandler(com.sankuai.waimai.store.im.poi.contract.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f956b31d66663e46e14ca330c12390cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f956b31d66663e46e14ca330c12390cd");
        } else {
            this.f = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        byte[] a2;
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d29ecef8e63f1bf361bd3980ef72ae11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d29ecef8e63f1bf361bd3980ef72ae11");
        } else if (TextUtils.equals("jump", str)) {
            if (map == null || map.isEmpty()) {
                return;
            }
            JumpBean jumpBean = new JumpBean();
            if (map.get("type") != null) {
                if (map.get("type").getClass().equals(Long.class)) {
                    jumpBean.type = ((Long) map.get("type")).intValue();
                } else if (map.get("type").getClass().equals(String.class)) {
                    try {
                        jumpBean.type = Integer.valueOf((String) map.get("type")).intValue();
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
            }
            if (map.get(NetLogConstants.Details.SCHEME) instanceof String) {
                jumpBean.scheme = (String) map.get(NetLogConstants.Details.SCHEME);
            }
            if (map.get("scheme_type") != null && (map.get("scheme_type") instanceof String)) {
                try {
                    jumpBean.scheme_ype = Integer.valueOf((String) map.get("scheme_type")).intValue();
                } catch (Exception e2) {
                    com.sankuai.shangou.stone.util.log.a.a(e2);
                }
            }
            HashMap hashMap = new HashMap();
            if (map.get("append_params") instanceof Map) {
                for (Map.Entry entry : ((Map) map.get("append_params")).entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        if (entry.getValue() instanceof String) {
                            hashMap.put(entry.getKey(), (String) entry.getValue());
                        } else {
                            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                    }
                }
            }
            jumpBean.append_params = hashMap;
            a(jumpBean, aVar.a());
        } else if (TextUtils.equals("mach_im_normal_data", str)) {
            if (this.b != null) {
                this.b.a(map, aVar);
            }
        } else if (TextUtils.equals("mach_im_normal_send_msg", str)) {
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0136861f1efb9dcf5545dcb8768763c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0136861f1efb9dcf5545dcb8768763c");
            } else if (map.get("data") != null && (a2 = com.sankuai.waimai.store.im.util.b.a(map.get("data"))) != null) {
                IMUIManager.a().a((IMMessage) c.a(a2), false);
            }
        } else if (TextUtils.equals("mach_im_delete_normal_msg_data", str)) {
            if (this.b != null) {
                this.b.a(map);
            }
        } else if (TextUtils.equals("mach_im_normal_send_tip_msg", str)) {
            if (this.f != null) {
                this.f.a(map);
            }
        } else if (TextUtils.equals("mach_im_group_at_poi_msg", str)) {
            if (this.c != null) {
                this.c.a();
            }
        } else if (TextUtils.equals("mach_im_general_local_msg", str)) {
            if (this.f != null) {
                this.f.a_(map);
            }
        } else if (TextUtils.equals("foods_detail_click_foods_item", str)) {
            Activity a3 = aVar.a();
            Object[] objArr3 = {map, a3};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "244f4e4641c055b8af63a9733790d96e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "244f4e4641c055b8af63a9733790d96e");
            } else if (map != null) {
                try {
                    String valueOf = String.valueOf(map.get("spuId"));
                    String valueOf2 = String.valueOf(map.get("poiId"));
                    if (!t.a(valueOf) && !t.a(valueOf2)) {
                        com.sankuai.waimai.store.im.util.b.a(valueOf, valueOf2, this.f.v(), a3);
                    }
                } catch (Exception unused) {
                }
            }
        } else if (TextUtils.equals("jump_preview_image_page", str)) {
            a(map, aVar.a());
        } else if (TextUtils.equals("jump_preview_video_page", str)) {
            Activity a4 = aVar.a();
            Object[] objArr4 = {map, a4};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3a32cd66c8fa8ad03148d3af53eef71d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3a32cd66c8fa8ad03148d3af53eef71d");
            } else if (map != null) {
                try {
                    if (com.sankuai.waimai.store.util.b.a(a4)) {
                        return;
                    }
                    String a5 = map.get(ShowLogJsHandler.PARAM_NAME_MODULE) != null ? i.a(map.get(ShowLogJsHandler.PARAM_NAME_MODULE)) : "";
                    JSONObject a6 = com.sankuai.xm.imui.session.b.b(a4).b.a();
                    String valueOf3 = map.get("poiIdStr") != null ? String.valueOf(map.get("poiIdStr")) : "";
                    String valueOf4 = map.get("videoUrl") != null ? String.valueOf(map.get("videoUrl")) : "";
                    String valueOf5 = map.get("videoCoverImageUrl") != null ? String.valueOf(map.get("videoCoverImageUrl")) : "";
                    Long l = -999L;
                    if (map.get("duration") != null && (map.get("duration") instanceof Long)) {
                        l = (Long) map.get("duration");
                    }
                    com.meituan.android.ptcommonim.video.a.a(a4, new VideoPreviewParam(0, a6, valueOf4, valueOf5, l.longValue(), a5), new PTIMCommonBean("1702", valueOf3, d.a, "", PTIMCommonBean.UserType.TYPE_C));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        } else if (TextUtils.equals("mach_im_withdraw", str)) {
            Object[] objArr5 = {map, aVar.a()};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "166806d735cc33324a8e02ecfdb49f37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "166806d735cc33324a8e02ecfdb49f37");
            } else if (this.f.bx_() != null && this.e != null && this.d != null) {
                this.f.bx_().onLongClick(this.e, this.d);
            }
        }
    }

    private void a(Map<String, Object> map, Context context) {
        Object[] objArr = {map, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "600f42abf7169a57b7684c3ab0bd88c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "600f42abf7169a57b7684c3ab0bd88c9");
        } else if (map != null) {
            try {
                if (com.sankuai.waimai.store.util.b.a(context)) {
                    return;
                }
                List arrayList = new ArrayList();
                try {
                    if (map.get("picList") != null) {
                        arrayList = (List) i.a(i.a(map.get("picList")), new TypeToken<List<String>>() { // from class: com.sankuai.waimai.store.im.base.mach.IMJSEventHandler.1
                        }.getType());
                    }
                } catch (Exception unused) {
                    arrayList = new ArrayList();
                }
                Long.valueOf(-999L);
                if (map.get("messageId") != null && (map.get("messageId") instanceof Long)) {
                    map.get("messageId");
                }
                ArrayList arrayList2 = new ArrayList();
                if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        String str = (String) arrayList.get(i);
                        if (str != null) {
                            arrayList2.add(new PicItemParam(str));
                        }
                    }
                }
                String a2 = map.get(ShowLogJsHandler.PARAM_NAME_MODULE) != null ? i.a(map.get(ShowLogJsHandler.PARAM_NAME_MODULE)) : "";
                JSONObject a3 = com.sankuai.xm.imui.session.b.b(context).b.a();
                String valueOf = map.get("poiIdStr") != null ? String.valueOf(map.get("poiIdStr")) : "";
                PicPreviewParam picPreviewParam = new PicPreviewParam(a3, arrayList2, null, a2);
                PTIMCommonBean pTIMCommonBean = new PTIMCommonBean("1702", valueOf, d.a, "", PTIMCommonBean.UserType.TYPE_C);
                Object[] objArr2 = {context, picPreviewParam, pTIMCommonBean};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.video.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8d0db289cefadc799bac60a5cf63445d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8d0db289cefadc799bac60a5cf63445d");
                    return;
                }
                try {
                    Intent a4 = com.meituan.android.ptcommonim.video.a.a(context);
                    a4.putExtra("video_operate_param", picPreviewParam);
                    a4.putExtra("video_common_bean", pTIMCommonBean);
                    context.startActivity(a4);
                } catch (Throwable unused2) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(JumpBean jumpBean, Context context) {
        Object[] objArr = {jumpBean, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf4b7463d071286dbb8e032f0825b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf4b7463d071286dbb8e032f0825b9c");
            return;
        }
        String str = jumpBean.scheme;
        Bundle bundle = null;
        if (TextUtils.isEmpty(str) || com.sankuai.waimai.store.util.b.a(context)) {
            return;
        }
        if (jumpBean.type == 0) {
            com.sankuai.waimai.store.router.d.a(context, str);
        } else if (jumpBean.type == 2) {
            if (jumpBean.scheme_ype == 1) {
                str = com.sankuai.waimai.store.router.c.l;
            } else if (jumpBean.scheme_ype == 2) {
                str = com.sankuai.waimai.foundation.router.interfaces.c.ac;
            }
            if (jumpBean.append_params != null && !jumpBean.append_params.isEmpty()) {
                bundle = new Bundle();
                for (String str2 : jumpBean.append_params.keySet()) {
                    if (str2 != null) {
                        bundle.putString(str2, jumpBean.append_params.get(str2));
                    }
                }
            }
            if (bundle == null) {
                com.sankuai.waimai.store.router.d.a(context, str);
            } else {
                com.sankuai.waimai.store.router.d.a(context, str, bundle);
            }
        } else {
            com.sankuai.waimai.store.router.d.a(context, str, jumpBean.append_params);
        }
    }
}
