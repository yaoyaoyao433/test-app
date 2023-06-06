package com.sankuai.waimai.bussiness.order.comment.rn;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.domain.core.comment.ShareInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShareCommentJumpModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMShareCommentJumpModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMShareCommentJumpModule";
    }

    public ShareCommentJumpModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2021a68c7778a05b8ba8035526c2430c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2021a68c7778a05b8ba8035526c2430c");
        }
    }

    @ReactMethod
    public void jump(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53c9bdfbb0638c997549e9f727f557f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53c9bdfbb0638c997549e9f727f557f8");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject(str);
            final ShareInfo fromJson = ShareInfo.fromJson(jSONObject);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.ShareCommentJumpModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d7ca235511ac3cfda4df5acebb6af77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d7ca235511ac3cfda4df5acebb6af77");
                        return;
                    }
                    try {
                        com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
                        SubmitOrderManager.getInstance().updateOrderStatus();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("intent_share_info", fromJson);
                        bundle.putString("intent_comment_feedback", jSONObject.optString("comment_feedback"));
                        bundle.putInt("source", 1);
                        bundle.putString("intent_share_info_rn", str);
                        bundle.putString("intent_share_info_complaint_url", jSONObject.optString("compliant_url"));
                        bundle.putString("intent_share_info_complaint_order_id", jSONObject.optString("order_view_id"));
                        bundle.putString("intent_share_info_complaint_bu_ext", jSONObject.optString("bu_ext"));
                        Activity currentActivity = ShareCommentJumpModule.this.getCurrentActivity();
                        if (currentActivity != null) {
                            String string = currentActivity.getString(R.string.wm_order_comment_share_jump_url);
                            if (com.sankuai.waimai.foundation.core.a.f()) {
                                string = string + "&mrn_min_version=2.0.52";
                            }
                            com.sankuai.waimai.foundation.router.a.a(currentActivity, string, bundle);
                            if (f.a(currentActivity)) {
                                return;
                            }
                            currentActivity.finish();
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a("WMShareCommentJumpModule", e);
                    }
                }
            });
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a("WMShareCommentJumpModule", e);
        }
    }
}
