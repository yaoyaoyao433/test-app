package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.comment.ShareInfo;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.util.al;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGShareCommentJumpModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMShareCommentJumpModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMShareCommentJumpModule";
    }

    public SGShareCommentJumpModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e913ee331ee1229a53935e235a7f8fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e913ee331ee1229a53935e235a7f8fb");
        }
    }

    @ReactMethod
    public void jump(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a1a497da524577be27c02ef86f357eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a1a497da524577be27c02ef86f357eb");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject(str);
            final ShareInfo fromJson = ShareInfo.fromJson(jSONObject);
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGShareCommentJumpModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be055be0c6c0b39c29f67c39fbba1caa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be055be0c6c0b39c29f67c39fbba1caa");
                        return;
                    }
                    try {
                        com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
                        com.sankuai.waimai.business.order.api.submit.c.a().updateOrderStatus();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("intent_share_info", fromJson);
                        bundle.putString("intent_comment_feedback", jSONObject.optString("comment_feedback"));
                        bundle.putInt("source", 1);
                        bundle.putString("intent_share_info_rn", str);
                        bundle.putString("intent_share_info_complaint_url", jSONObject.optString("compliant_url"));
                        bundle.putString("intent_share_info_complaint_order_id", jSONObject.optString("order_view_id"));
                        bundle.putString("intent_share_info_complaint_bu_ext", jSONObject.optString("bu_ext"));
                        Activity currentActivity = SGShareCommentJumpModule.this.getCurrentActivity();
                        if (currentActivity != null) {
                            String string = currentActivity.getString(R.string.wm_sc_order_comment_share_jump_url);
                            if (k.e()) {
                                string = string + "&mrn_min_version=2.0.52";
                            }
                            com.sankuai.waimai.store.router.d.a(currentActivity, string, bundle);
                            if (com.sankuai.waimai.store.util.b.a(currentActivity)) {
                                return;
                            }
                            currentActivity.finish();
                        }
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a("WMShareCommentJumpModule", e);
                    }
                }
            }, "");
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a("WMShareCommentJumpModule", e);
        }
    }
}
