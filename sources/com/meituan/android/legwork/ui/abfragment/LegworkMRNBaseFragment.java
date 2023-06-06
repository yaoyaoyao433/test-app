package com.meituan.android.legwork.ui.abfragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.titans.js.JsHandlerFactory;
import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.legwork.common.widget.CommonLoadingView;
import com.meituan.android.legwork.ui.abactivity.LegworkMainActivity;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkMRNBaseFragment extends MRNBaseFragment {
    public static ChangeQuickRedirect a;
    CommonLoadingView b;
    private Handler c;
    private BroadcastReceiver g;
    private Context h;
    private int i;

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a7950a3d89acedbb2813381a4ae5cb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a7950a3d89acedbb2813381a4ae5cb3");
        }
        FrameLayout frameLayout = (FrameLayout) super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.i == 2) {
            x.c("mrn_fragment.loading", "主页面loading创建");
            this.b = (CommonLoadingView) layoutInflater.inflate(R.layout.legwork_common_loading, viewGroup, false);
            frameLayout.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        }
        return frameLayout;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb824c7cf70b29eb4d5d34fd58ca3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb824c7cf70b29eb4d5d34fd58ca3fc");
            return;
        }
        super.onResume();
        if (getUserVisibleHint()) {
            a(true);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d143061428449046888c12c6f85ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d143061428449046888c12c6f85ebd");
            return;
        }
        super.onPause();
        if (getUserVisibleHint()) {
            a(false);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fab8be2f1a2de4ec26812e23cc7418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fab8be2f1a2de4ec26812e23cc7418");
            return;
        }
        d(getContext());
        q();
        super.onDetach();
        x.c("mrn_fragment.onDetach", new Object[0]);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57898d99d96ee44c7492e38a42fa42ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57898d99d96ee44c7492e38a42fa42ca");
            return;
        }
        super.onAttach(context);
        this.h = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46520cbe42f20e7bee7b3e6fe8775573", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46520cbe42f20e7bee7b3e6fe8775573")).intValue();
        } else {
            Uri m = m();
            if (m == null) {
                x.d("mrn_fragment.getLoadingType", "none, 无法获取mrn_arg");
            } else {
                String queryParameter = m.getQueryParameter("mrn_no_loading_notify");
                String queryParameter2 = m.getQueryParameter("mrn_component");
                x.d("mrn_fragment.getLoadingType", String.format("mrnNoLoadingNotify: %s, mrnComponentName: %s", queryParameter, queryParameter2));
                if (TextUtils.equals(queryParameter, "1")) {
                    x.d("mrn_fragment.getLoadingType", "none, scheme设置不显示统一loading");
                } else if (getActivity() instanceof ToSendOneMoreActivity) {
                    x.d("mrn_fragment.getLoadingType", "pt_shell, 跑腿壳统一loading");
                    i = 1;
                } else {
                    boolean a2 = com.meituan.android.legwork.common.util.a.a().a(queryParameter2);
                    if (!(getActivity() instanceof LegworkMainActivity) || a2) {
                        x.d("mrn_fragment.getLoadingType", "none, 默认");
                    } else {
                        x.d("mrn_fragment.getLoadingType", "homepage, 首页统一loading");
                        i = 2;
                    }
                }
            }
            i = 0;
        }
        this.i = i;
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea34026c1e7c2f15c48a409dce039a7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea34026c1e7c2f15c48a409dce039a7e");
        } else if (this.h != null && this.g == null && this.i != 0) {
            x.d("mrn_fragment.registerMRNRenderFinished", "注册MRN结束loading广播: " + this.i);
            this.g = new BroadcastReceiver() { // from class: com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    Object[] objArr4 = {context2, intent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b9c37df3c9e8cdc503b81e68efcf3ac3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b9c37df3c9e8cdc503b81e68efcf3ac3");
                        return;
                    }
                    x.d("mrn_fragment.registerMRNRenderFinished", "接收到MRN结束loading的广播");
                    if (intent == null) {
                        return;
                    }
                    String a3 = f.a(intent, "data");
                    if (TextUtils.isEmpty(a3)) {
                        return;
                    }
                    try {
                        JsonObject jsonObject = (JsonObject) com.meituan.android.legwork.net.util.b.a().fromJson(a3, (Class<Object>) JsonObject.class);
                        if (jsonObject != null && jsonObject.has("rootTag") && LegworkMRNBaseFragment.this.n() != null) {
                            String asString = jsonObject.get("rootTag").getAsString();
                            String valueOf = String.valueOf(LegworkMRNBaseFragment.this.n().e());
                            x.d("mrn_fragment.registerMRNRenderFinished", "nativeRootTag: " + valueOf + " mrn:" + asString);
                            if (TextUtils.equals(asString, valueOf)) {
                                LegworkMRNBaseFragment.this.b(false);
                                LegworkMRNBaseFragment.this.q();
                            }
                            HashMap hashMap = new HashMap(4);
                            hashMap.put("isMrnContainerLoadingTimeOut", "0");
                            hashMap.put("componentName", LegworkMRNBaseFragment.this.c());
                            q.a("legwork_common", hashMap);
                        }
                    } catch (Exception e) {
                        x.d("mrn_fragment.registerMRNRenderFinished", "入口状态 解析json失败, data:" + a3 + "exception msg:", e);
                        x.a(e);
                    }
                }
            };
            try {
                context.registerReceiver(this.g, new IntentFilter("legwork:mrn_shell_stop_loading"));
            } catch (Exception e) {
                x.d("mrn_fragment.registerMRNRenderFinished", "入口状态注册失败,exception msg:", e);
            }
        }
        x.b("mrn_fragment", "onAttach:" + getUserVisibleHint());
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6916b73e4b230d30fcdae9510d608d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6916b73e4b230d30fcdae9510d608d");
            return;
        }
        super.setUserVisibleHint(z);
        a(z);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.facebook.react.modules.core.b
    public final void r_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8365a23ccee27eae9a5b1259adc01239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8365a23ccee27eae9a5b1259adc01239");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity.isFinishing() && activity.isDestroyed()) {
                return;
            }
            activity.finish();
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1d2949c0660daad3b4d61ea6177ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1d2949c0660daad3b4d61ea6177ece");
            return;
        }
        try {
            String c = c();
            if (!TextUtils.isEmpty(c) && (TextUtils.equals(c, "legwork-orderlist") || TextUtils.equals(c, "legwork-my-info") || TextUtils.equals(c, "legwork-send"))) {
                x.c("mrn_fragment", "页面是否可见_" + c + StringUtil.SPACE + z);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "legwork:mrn_page_visible");
                jSONObject.put("visible", z ? 1 : 0);
                jSONObject.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, a());
                jSONObject.put("componentName", c());
                if (n() != null) {
                    jSONObject.put("rootTag", n().e());
                }
                if (getArguments() != null) {
                    String string = getArguments().getString("eventType");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put("eventType", string);
                    }
                }
                JsHandlerFactory.publish(jSONObject);
                return;
            }
            x.c("mrn_fragment", "【不需要通知】页面是否可见_" + c + StringUtil.SPACE + z);
        } catch (Exception e) {
            x.e("LegworkMRNBaseFragment.sendEventToMRN()", "页面可见性广播发送失败,exception msg:", e);
            x.a(e);
        }
    }

    private void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2322159ffc156d00e9b59669d45e6973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2322159ffc156d00e9b59669d45e6973");
        } else if (this.g == null || context == null) {
        } else {
            context.unregisterReceiver(this.g);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54761ef46dae42bf908ec6ccac63f7c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54761ef46dae42bf908ec6ccac63f7c3");
            return;
        }
        super.i();
        x.d("mrn_fragment.showLoadingView", new Object[0]);
        b(true);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a28339692785e18d74d89b256e72f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a28339692785e18d74d89b256e72f31");
            return;
        }
        super.e();
        x.d("mrn_fragment.showErrorView", new Object[0]);
        b(false);
        q();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77ac1f238cd779b96adaf6211cb94ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77ac1f238cd779b96adaf6211cb94ee");
            return;
        }
        super.f();
        if (this.i == 0) {
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908b0bbe9ba1bcbc9c4c8d797f3454f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908b0bbe9ba1bcbc9c4c8d797f3454f5");
            return;
        }
        if (this.i == 1) {
            if (getActivity() instanceof ToSendOneMoreActivity) {
                x.c("mrn_fragment.loading", Boolean.valueOf(z));
                ((ToSendOneMoreActivity) getActivity()).a(z);
            }
        } else if (this.i == 2 && this.b != null) {
            x.c("mrn_fragment.loading", "主页面loading:" + z);
            if (z) {
                this.b.a();
            } else {
                this.b.b();
            }
        } else if (this.i == 0) {
            if (z || !(getActivity() instanceof ToSendOneMoreActivity)) {
                return;
            }
            x.c("mrn_fragment.loading", "停止loading");
            ((ToSendOneMoreActivity) getActivity()).a(false);
            return;
        }
        if (z) {
            p();
            String c = c();
            long c2 = com.meituan.android.legwork.common.util.a.a().c(c) * 1000;
            x.c("mrn_fragment.loading", "开始超时计时" + c2 + " 页面名:" + c);
            this.c.sendEmptyMessageDelayed(1, c2);
        }
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d45e5928d6be3aa9ccec6a086ce793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d45e5928d6be3aa9ccec6a086ce793");
        } else if (this.c != null) {
        } else {
            this.c = new Handler(Looper.getMainLooper(), a.a(this));
        }
    }

    public static /* synthetic */ boolean a(LegworkMRNBaseFragment legworkMRNBaseFragment, Message message) {
        Object[] objArr = {legworkMRNBaseFragment, message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ff048a4ca5284d2e81c437a243da079", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ff048a4ca5284d2e81c437a243da079")).booleanValue();
        }
        if (message.what == 1) {
            x.d("mrn_fragment.ensureHandler", "超时，结束loading");
            legworkMRNBaseFragment.b(false);
            legworkMRNBaseFragment.d(legworkMRNBaseFragment.getContext());
            HashMap hashMap = new HashMap(4);
            hashMap.put("isMrnContainerLoadingTimeOut", "1");
            hashMap.put("componentName", legworkMRNBaseFragment.c());
            q.a("legwork_common", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb48f780025b5a1b71fb2276504e92aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb48f780025b5a1b71fb2276504e92aa");
        } else if (this.c != null) {
            this.c.removeMessages(1);
        }
    }
}
