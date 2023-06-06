package com.sankuai.waimai.bussiness.order.list.knb;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.bussiness.order.confirm.model.AddressBackInfo;
import com.sankuai.waimai.imbase.d;
import com.sankuai.waimai.imbase.manager.e;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderSchemaKNBHandler extends BaseJsHandler implements d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String CONTACT_FOOD_SAFETY_IM;
    private String REGISTER_IM_OBSERVER;
    private String TO_MODIFY_ADDRESS;
    private String TO_PAY_FRIEND;
    private String TO_POI_IM;
    private String UN_REGISTER_IM_OBSERVER;
    private boolean hasRegistered;
    private long mFoodSafetyImGroupId;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "PIPMb6GLzRxPvh84mLsastondebGPElz691ot4zgN6j6dXWeCUmkXGVoXQp/ZmsOdIrhNZ/xbw+SVn6cz8AJMw==";
    }

    public OrderSchemaKNBHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08094c4a70939d97ce44a813665534fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08094c4a70939d97ce44a813665534fd");
            return;
        }
        this.hasRegistered = false;
        this.CONTACT_FOOD_SAFETY_IM = "contact_food_safety_im";
        this.REGISTER_IM_OBSERVER = "register_im_observer";
        this.UN_REGISTER_IM_OBSERVER = "unregister_im_observer";
        this.TO_PAY_FRIEND = "to_paybyfriend";
        this.TO_POI_IM = "to_poi_im";
        this.TO_MODIFY_ADDRESS = "to_modify_address";
        this.mFoodSafetyImGroupId = 0L;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f41e6afe97a35ce6b620d4a338ed9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f41e6afe97a35ce6b620d4a338ed9e");
        } else if (validateArgs()) {
            JSONObject jSONObject = jsBean().argsJson;
            Activity activity = jsHost().getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            String optString = jSONObject.optString("h5_type");
            String optString2 = jSONObject.optString("data");
            try {
                JsonObject asJsonObject = TextUtils.isEmpty(optString2) ? null : new JsonParser().parse(optString2).getAsJsonObject();
                if (this.TO_PAY_FRIEND.equals(optString)) {
                    payByFriend(optString2, activity);
                } else if (this.CONTACT_FOOD_SAFETY_IM.equals(optString)) {
                    contactFoodSafetyIMAction(asJsonObject, activity);
                } else if (this.TO_POI_IM.equals(optString)) {
                    contactPoiIMAction(asJsonObject, activity);
                } else if (this.REGISTER_IM_OBSERVER.equals(optString)) {
                    registerUnReadCountObserver(asJsonObject, activity);
                } else if (this.UN_REGISTER_IM_OBSERVER.equals(optString)) {
                    unRegisterUnReadCountObserver(activity);
                } else if (this.TO_MODIFY_ADDRESS.equals(optString)) {
                    modifyAddressAction(asJsonObject, activity);
                }
            } catch (Exception e) {
                a.AbstractC1040a b = new com.sankuai.waimai.bussiness.order.base.log.a().a("order_h5_im_contact").b(e.toString());
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = optString;
                }
                i.d(b.c(optString2).b(true).b());
            }
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d76785b7ca2fea79dd6c0473551cad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d76785b7ca2fea79dd6c0473551cad")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }

    public void contactFoodSafetyIMAction(final JsonObject jsonObject, final Activity activity) {
        Object[] objArr = {jsonObject, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac35bcc6738c7d58d048dcae35cd83e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac35bcc6738c7d58d048dcae35cd83e");
        } else if (jsonObject == null) {
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:6:0x0018, B:8:0x0025, B:10:0x0038, B:11:0x003c, B:13:0x0048, B:15:0x005b, B:17:0x0062, B:19:0x006d, B:21:0x0080), top: B:29:0x0018 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r11 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.AnonymousClass1.a
                        java.lang.String r10 = "f7fc001d185ca0913eb1a54b03d9219f"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r11
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L18
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                        return
                    L18:
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> L91
                        java.lang.String r2 = "groupId"
                        com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.Exception -> L91
                        r2 = 0
                        if (r1 == 0) goto L3c
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> L91
                        java.lang.String r4 = "groupId"
                        com.google.gson.JsonElement r1 = r1.get(r4)     // Catch: java.lang.Exception -> L91
                        java.lang.String r1 = r1.getAsString()     // Catch: java.lang.Exception -> L91
                        boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L91
                        if (r4 != 0) goto L3c
                        long r2 = com.sankuai.common.utils.NumberUtils.parseLong(r1, r2)     // Catch: java.lang.Exception -> L91
                    L3c:
                        r3 = r2
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> L91
                        java.lang.String r2 = "groupType"
                        com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.Exception -> L91
                        if (r1 == 0) goto L61
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> L91
                        java.lang.String r2 = "groupType"
                        com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.Exception -> L91
                        java.lang.String r1 = r1.getAsString()     // Catch: java.lang.Exception -> L91
                        boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L91
                        if (r2 != 0) goto L61
                        int r1 = com.sankuai.common.utils.NumberUtils.parseInt(r1, r0)     // Catch: java.lang.Exception -> L91
                        r5 = r1
                        goto L62
                    L61:
                        r5 = 0
                    L62:
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> L91
                        java.lang.String r2 = "ref"
                        com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.Exception -> L91
                        if (r1 == 0) goto L86
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> L91
                        java.lang.String r2 = "ref"
                        com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.Exception -> L91
                        java.lang.String r1 = r1.getAsString()     // Catch: java.lang.Exception -> L91
                        boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L91
                        if (r2 != 0) goto L86
                        int r0 = com.sankuai.common.utils.NumberUtils.parseInt(r1, r0)     // Catch: java.lang.Exception -> L91
                        r7 = r0
                        goto L87
                    L86:
                        r7 = 0
                    L87:
                        android.app.Activity r1 = r3
                        r2 = 4
                        java.lang.String r6 = "refundstatus"
                        com.sankuai.waimai.bussiness.order.list.helper.a.a(r1, r2, r3, r5, r6, r7)
                        return
                    L91:
                        r0 = move-exception
                        com.sankuai.waimai.bussiness.order.base.log.a r1 = new com.sankuai.waimai.bussiness.order.base.log.a
                        r1.<init>()
                        java.lang.String r2 = "order_h5_im_contact"
                        com.sankuai.waimai.platform.capacity.log.a$a r1 = r1.a(r2)
                        java.lang.String r0 = r0.toString()
                        com.sankuai.waimai.platform.capacity.log.a$a r0 = r1.b(r0)
                        com.google.gson.JsonObject r1 = r2
                        java.lang.String r1 = r1.getAsString()
                        com.sankuai.waimai.platform.capacity.log.a$a r0 = r0.c(r1)
                        r1 = 1
                        com.sankuai.waimai.platform.capacity.log.a$a r0 = r0.b(r1)
                        com.sankuai.waimai.platform.capacity.log.a r0 = r0.b()
                        com.sankuai.waimai.platform.capacity.log.i.d(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.AnonymousClass1.run():void");
                }
            });
        }
    }

    public void contactPoiIMAction(final JsonObject jsonObject, final Activity activity) {
        Object[] objArr = {jsonObject, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b7312ca82c3c9e7a1bf013b911cb8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b7312ca82c3c9e7a1bf013b911cb8f0");
        } else if (jsonObject == null) {
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0100 A[Catch: Exception -> 0x01b2, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x011a A[Catch: Exception -> 0x01b2, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b2, blocks: (B:7:0x0026, B:9:0x0033, B:11:0x0046, B:13:0x004c, B:15:0x0057, B:17:0x006a, B:18:0x006e, B:20:0x0079, B:23:0x008d, B:25:0x0098, B:26:0x00a5, B:28:0x00b1, B:30:0x00c1, B:32:0x00cc, B:33:0x00d9, B:35:0x00e6, B:36:0x00f3, B:38:0x0100, B:39:0x010d, B:41:0x011a), top: B:53:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x018b  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 477
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.AnonymousClass2.run():void");
                }
            });
        }
    }

    public void registerUnReadCountObserver(JsonObject jsonObject, Activity activity) {
        Object[] objArr = {jsonObject, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d88288dd095c4d9345b0e6e1f988775b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d88288dd095c4d9345b0e6e1f988775b");
        } else if (this.hasRegistered) {
        } else {
            try {
                if (jsonObject.get("groupId") != null) {
                    String asString = jsonObject.get("groupId").getAsString();
                    if (!TextUtils.isEmpty(asString)) {
                        this.mFoodSafetyImGroupId = NumberUtils.parseLong(asString, 0L);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca653c49bc2d53dd3ef81a60c65c75dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca653c49bc2d53dd3ef81a60c65c75dd");
                        return;
                    }
                    e.a().a(OrderSchemaKNBHandler.this);
                    OrderSchemaKNBHandler.this.hasRegistered = true;
                }
            });
        }
    }

    private void payByFriend(final String str, final Activity activity) {
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3d596423dc947d723bae667d03bd84f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3d596423dc947d723bae667d03bd84f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd6123b2f31f9d1c97134722198c5d27", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd6123b2f31f9d1c97134722198c5d27");
                    } else {
                        com.sankuai.waimai.bussiness.order.base.utils.i.a(activity, str);
                    }
                }
            });
        }
    }

    public void unRegisterUnReadCountObserver(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba6c6f1991f1128b59dd67cc0834e8eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba6c6f1991f1128b59dd67cc0834e8eb");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "76734176cd111aa346ff35f8da20c16b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "76734176cd111aa346ff35f8da20c16b");
                        return;
                    }
                    e.a().b(OrderSchemaKNBHandler.this);
                    OrderSchemaKNBHandler.this.mFoodSafetyImGroupId = 0L;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.imbase.d
    public void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af5f08deae3b88a1e96e8e89e2f26913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af5f08deae3b88a1e96e8e89e2f26913");
        } else if (this.mFoodSafetyImGroupId != 0) {
            Integer num = longSparseArray.get(this.mFoodSafetyImGroupId);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "updateImUnReadCount");
                jSONObject.put("count", com.sankuai.waimai.bussiness.order.detailnew.util.a.a(num));
                JsHandlerFactory.publish(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void modifyAddressAction(final JsonObject jsonObject, final Activity activity) {
        Object[] objArr = {jsonObject, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f25ddb6db6449eabe123c035eea5de4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f25ddb6db6449eabe123c035eea5de4d");
        } else if (jsonObject == null) {
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.6
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:7:0x001a, B:9:0x0027, B:11:0x003a, B:13:0x0040, B:15:0x004b, B:17:0x005e, B:19:0x0064, B:21:0x006f), top: B:31:0x001a }] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:7:0x001a, B:9:0x0027, B:11:0x003a, B:13:0x0040, B:15:0x004b, B:17:0x005e, B:19:0x0064, B:21:0x006f), top: B:31:0x001a }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r11 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.AnonymousClass6.a
                        java.lang.String r10 = "c1f6aef019c8f5a8582c838bc4fa23e6"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r11
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L18
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                        return
                    L18:
                        java.lang.String r0 = ""
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r2 = "orderId"
                        com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lb0
                        r2 = 0
                        if (r1 == 0) goto L3f
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r4 = "orderId"
                        com.google.gson.JsonElement r1 = r1.get(r4)     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r1 = r1.getAsString()     // Catch: java.lang.Exception -> Lb0
                        boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lb0
                        if (r4 != 0) goto L3f
                        long r4 = com.sankuai.common.utils.NumberUtils.parseLong(r1, r2)     // Catch: java.lang.Exception -> Lb0
                        goto L40
                    L3f:
                        r4 = r2
                    L40:
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r6 = "poiId"
                        com.google.gson.JsonElement r1 = r1.get(r6)     // Catch: java.lang.Exception -> Lb0
                        if (r1 == 0) goto L63
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r6 = "poiId"
                        com.google.gson.JsonElement r1 = r1.get(r6)     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r1 = r1.getAsString()     // Catch: java.lang.Exception -> Lb0
                        boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lb0
                        if (r6 != 0) goto L63
                        long r6 = com.sankuai.common.utils.NumberUtils.parseLong(r1, r2)     // Catch: java.lang.Exception -> Lb0
                        goto L64
                    L63:
                        r6 = r2
                    L64:
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r8 = "poiIdStr"
                        com.google.gson.JsonElement r1 = r1.get(r8)     // Catch: java.lang.Exception -> Lb0
                        if (r1 == 0) goto L83
                        com.google.gson.JsonObject r1 = r2     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r8 = "poiIdStr"
                        com.google.gson.JsonElement r1 = r1.get(r8)     // Catch: java.lang.Exception -> Lb0
                        java.lang.String r1 = r1.getAsString()     // Catch: java.lang.Exception -> Lb0
                        boolean r8 = com.sankuai.waimai.foundation.utils.aa.a(r1)     // Catch: java.lang.Exception -> Lb0
                        if (r8 != 0) goto L83
                        r0 = r1
                    L83:
                        int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                        if (r1 == 0) goto Laf
                        android.os.Bundle r1 = new android.os.Bundle
                        r1.<init>()
                        java.lang.String r2 = "orderId"
                        java.lang.String r3 = java.lang.String.valueOf(r4)
                        r1.putString(r2, r3)
                        java.lang.String r2 = "poiId"
                        java.lang.String r3 = java.lang.String.valueOf(r6)
                        r1.putString(r2, r3)
                        java.lang.String r2 = "poi_id_str"
                        r1.putString(r2, r0)
                        android.app.Activity r0 = r3
                        java.lang.String r2 = com.sankuai.waimai.foundation.router.interfaces.c.ac
                        r3 = 2040(0x7f8, float:2.859E-42)
                        com.sankuai.waimai.foundation.router.a.a(r0, r2, r1, r3)
                    Laf:
                        return
                    Lb0:
                        r0 = move-exception
                        com.sankuai.waimai.bussiness.order.base.log.a r1 = new com.sankuai.waimai.bussiness.order.base.log.a
                        r1.<init>()
                        java.lang.String r2 = "aftersales_h5_modify_address"
                        com.sankuai.waimai.platform.capacity.log.a$a r1 = r1.a(r2)
                        java.lang.String r0 = r0.toString()
                        com.sankuai.waimai.platform.capacity.log.a$a r0 = r1.b(r0)
                        com.google.gson.JsonObject r1 = r2
                        java.lang.String r1 = r1.getAsString()
                        com.sankuai.waimai.platform.capacity.log.a$a r0 = r0.c(r1)
                        r1 = 1
                        com.sankuai.waimai.platform.capacity.log.a$a r0 = r0.b(r1)
                        com.sankuai.waimai.platform.capacity.log.a r0 = r0.b()
                        com.sankuai.waimai.platform.capacity.log.i.d(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.list.knb.OrderSchemaKNBHandler.AnonymousClass6.run():void");
                }
            });
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1767fde010610e767c067ccf0c56e274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1767fde010610e767c067ccf0c56e274");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 2040 && i2 == -1) {
            String str = "";
            String str2 = "";
            if (intent != null) {
                str = f.a(intent, "resultData");
                str2 = f.a(intent, "appId");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !"be7dcad4cf774fed".equals(str2)) {
                return;
            }
            try {
                AddressBackInfo addressBackInfo = (AddressBackInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(str, (Class<Object>) AddressBackInfo.class);
                if (addressBackInfo == null || !addressBackInfo.modifyType) {
                    return;
                }
                Activity activity = jsHost().getActivity();
                activity.setResult(-1);
                activity.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
