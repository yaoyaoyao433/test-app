package com.meituan.android.yoda.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.Gson;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.IOUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.activity.YodaConfirmActivity;
import com.meituan.android.yoda.bean.CustomHint;
import com.meituan.android.yoda.bean.Prompt;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.r;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.widget.view.BaseImageView;
import com.meituan.android.yoda.widget.view.BaseTextView;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThirdPartyVerifyFragment extends BaseFragment implements com.meituan.android.yoda.interfaces.b {
    public static ChangeQuickRedirect o;
    private b A;
    public com.meituan.android.yoda.callbacks.c p;
    public Tencent q;
    public IUiListener r;
    private String s;
    private String t;
    private String u;
    private TextView v;
    private TextView w;
    private LinearLayout x;
    private RecyclerView y;
    private e z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface b {
        void a(ThirdPartyBean thirdPartyBean);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        return "c_techportal_hcz6j0d4";
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void f() {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final int g() {
        return 0;
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final boolean j() {
        return false;
    }

    public static /* synthetic */ void a(ThirdPartyVerifyFragment thirdPartyVerifyFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "751b468c8090405ae2a7e261fe92c1c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "751b468c8090405ae2a7e261fe92c1c3");
        } else if (thirdPartyVerifyFragment.x == null || thirdPartyVerifyFragment.v == null || thirdPartyVerifyFragment.w == null) {
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(thirdPartyVerifyFragment.v.getText());
            stringBuffer.append(thirdPartyVerifyFragment.w.getText());
            thirdPartyVerifyFragment.x.setContentDescription(stringBuffer.toString());
        }
    }

    public static /* synthetic */ void a(ThirdPartyVerifyFragment thirdPartyVerifyFragment, CustomHint customHint) {
        Object[] objArr = {customHint};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "5887f11d152a595122f19fce6f77ec81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "5887f11d152a595122f19fce6f77ec81");
        } else if (customHint != null) {
            String str = customHint.pageTitle;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = BaseFragment.a;
            if (PatchProxy.isSupport(objArr2, thirdPartyVerifyFragment, changeQuickRedirect2, false, "8b8af37e4099119f76efe2531e363429", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, thirdPartyVerifyFragment, changeQuickRedirect2, false, "8b8af37e4099119f76efe2531e363429");
            } else if (!TextUtils.isEmpty(str) && thirdPartyVerifyFragment.getActivity() != null && (thirdPartyVerifyFragment.getActivity() instanceof YodaConfirmActivity)) {
                ((YodaConfirmActivity) thirdPartyVerifyFragment.getActivity()).b(str);
            }
            if (thirdPartyVerifyFragment.v == null || TextUtils.isEmpty(customHint.operationHint)) {
                return;
            }
            thirdPartyVerifyFragment.v.setText(customHint.operationHint);
        }
    }

    public static /* synthetic */ void a(ThirdPartyVerifyFragment thirdPartyVerifyFragment, HashMap hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "38575502cbeb4524b1475b1b1d18c6a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "38575502cbeb4524b1475b1b1d18c6a6");
        } else {
            thirdPartyVerifyFragment.b(hashMap, thirdPartyVerifyFragment.j);
        }
    }

    public static /* synthetic */ void d(ThirdPartyVerifyFragment thirdPartyVerifyFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "236523c4bafd133f92ca6e66b543fc03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, thirdPartyVerifyFragment, changeQuickRedirect, false, "236523c4bafd133f92ca6e66b543fc03");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, thirdPartyVerifyFragment.d);
        hashMap.put("method", "122");
        hashMap.put(IOUtils.YODA_VERSION, x.i());
        hashMap.put("action", thirdPartyVerifyFragment.getAction());
        hashMap2.put("thirdType", str);
        hashMap.put("custom", hashMap2);
        Statistics.getChannel("techportal").writeModelClick(thirdPartyVerifyFragment.getPageInfoKey(), "b_techportal_a2nhyu4v_mc", hashMap, "c_techportal_hcz6j0d4");
    }

    public static /* synthetic */ void a(ThirdPartyVerifyFragment thirdPartyVerifyFragment, ThirdPartyBean thirdPartyBean) {
        Object[] objArr = {thirdPartyVerifyFragment, thirdPartyBean};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84c385088a7455463f7b3e78f6a591f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84c385088a7455463f7b3e78f6a591f6");
        } else if (thirdPartyBean == null) {
        } else {
            switch (thirdPartyBean.thirdTypeId) {
                case 0:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = o;
                    if (PatchProxy.isSupport(objArr2, thirdPartyVerifyFragment, changeQuickRedirect2, false, "450b15d52bd86b7c5d71ee3df6bcbca1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, thirdPartyVerifyFragment, changeQuickRedirect2, false, "450b15d52bd86b7c5d71ee3df6bcbca1");
                        return;
                    }
                    IWXAPI createWXAPI = WXAPIFactory.createWXAPI(thirdPartyVerifyFragment.getActivity(), thirdPartyVerifyFragment.u, true);
                    if (!createWXAPI.isWXAppInstalled()) {
                        try {
                            x.a(thirdPartyVerifyFragment.getActivity(), (int) R.string.yoda_third_party_verify_app_not_installed);
                            thirdPartyVerifyFragment.k();
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    createWXAPI.registerApp(thirdPartyVerifyFragment.u);
                    SendAuth.Req req = new SendAuth.Req();
                    req.scope = "snsapi_userinfo";
                    req.state = "yoda_sdk_login_verify";
                    createWXAPI.sendReq(req);
                    try {
                        if (thirdPartyVerifyFragment.z == null) {
                            thirdPartyVerifyFragment.z = new e();
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        thirdPartyVerifyFragment.z = null;
                        return;
                    }
                case 1:
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = o;
                    if (PatchProxy.isSupport(objArr3, thirdPartyVerifyFragment, changeQuickRedirect3, false, "1c4457e5e21aee1c6c86dc86637415b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, thirdPartyVerifyFragment, changeQuickRedirect3, false, "1c4457e5e21aee1c6c86dc86637415b0");
                        return;
                    } else if (thirdPartyVerifyFragment.getContext() == null || thirdPartyVerifyFragment.getContext().getApplicationContext() == null) {
                        return;
                    } else {
                        thirdPartyVerifyFragment.q = Tencent.createInstance(thirdPartyVerifyFragment.s, thirdPartyVerifyFragment.getContext().getApplicationContext());
                        if (thirdPartyVerifyFragment.q != null) {
                            if (!thirdPartyVerifyFragment.q.isQQInstalled(thirdPartyVerifyFragment.getContext())) {
                                x.a(thirdPartyVerifyFragment.getActivity(), (int) R.string.yoda_third_party_verify_app_not_installed);
                                thirdPartyVerifyFragment.k();
                                return;
                            }
                            thirdPartyVerifyFragment.q.login(thirdPartyVerifyFragment.getActivity(), "get_user_info", thirdPartyVerifyFragment.r);
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public ThirdPartyVerifyFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bbc5d3fbb8e13a1ed23b43a591dffcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bbc5d3fbb8e13a1ed23b43a591dffcc");
            return;
        }
        this.s = "";
        this.t = "";
        this.u = "";
        this.r = new IUiListener() { // from class: com.meituan.android.yoda.fragment.ThirdPartyVerifyFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.tencent.tauth.IUiListener
            public final void onCancel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "346efee2201180036620157ddb1e999b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "346efee2201180036620157ddb1e999b");
                }
            }

            @Override // com.tencent.tauth.IUiListener
            public final void onComplete(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9c0a80f34ef6ea9e550250840baa575", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9c0a80f34ef6ea9e550250840baa575");
                    return;
                }
                try {
                    if (obj instanceof JSONObject) {
                        String string = ((JSONObject) obj).getString(Constants.PARAM_ACCESS_TOKEN);
                        HashMap hashMap = new HashMap();
                        hashMap.put("thirdLoginToken", string);
                        hashMap.put("thirdType", "qq");
                        ThirdPartyVerifyFragment.this.a();
                        ThirdPartyVerifyFragment.a(ThirdPartyVerifyFragment.this, hashMap);
                    }
                } catch (Exception unused) {
                }
            }

            @Override // com.tencent.tauth.IUiListener
            public final void onError(UiError uiError) {
                Object[] objArr2 = {uiError};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dcd8a65bdedaa0e9f9a923fb63735bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dcd8a65bdedaa0e9f9a923fb63735bf");
                    return;
                }
                try {
                    x.a(ThirdPartyVerifyFragment.this.getActivity(), uiError.errorDetail);
                } catch (Exception unused) {
                }
            }

            @Override // com.tencent.tauth.IUiListener
            public final void onWarning(int i) {
                String str;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3a569b8b3c0bcd6c2969d1cf6dfa437", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3a569b8b3c0bcd6c2969d1cf6dfa437");
                    return;
                }
                switch (i) {
                    case Constants.ERROR_QQ_NOT_LOGIN /* -21 */:
                        str = "请确认QQ已登录";
                        break;
                    case Constants.ERROR_QQ_NOT_INSTALL /* -20 */:
                        str = "请确认QQ已安装";
                        break;
                    case -19:
                        str = "请授权QQ访问分享的文件的读写权限";
                        break;
                    default:
                        str = "QQ内部错误";
                        break;
                }
                try {
                    x.a(ThirdPartyVerifyFragment.this.getActivity(), str);
                } catch (Exception unused) {
                }
            }
        };
        this.z = new e();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        this.A = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d5bcc25b51508c537748ef011f2c52dc", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d5bcc25b51508c537748ef011f2c52dc") : new g(this);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e939e0c653652a05388d46588d67aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e939e0c653652a05388d46588d67aa");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1a75243711bc8649ecb17accaf9a84", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1a75243711bc8649ecb17accaf9a84");
        }
        c("yoda_third_part_page_launch", (String) null);
        return layoutInflater.inflate(R.layout.fragment_third_party_verify, viewGroup, false);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "040283627eec0f71d100dd543725b744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "040283627eec0f71d100dd543725b744");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f7d1f966df6c1a3cb20ac595e1d2918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f7d1f966df6c1a3cb20ac595e1d2918");
            return;
        }
        this.x = (LinearLayout) view.findViewById(R.id.ll_des);
        this.v = (TextView) view.findViewById(R.id.first_des_tv);
        this.w = (TextView) view.findViewById(R.id.sec_des_tv);
        this.y = (RecyclerView) view.findViewById(R.id.recycle_view);
        this.y.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.y.addItemDecoration(new a());
        a();
        a((HashMap<String, String>) null, new com.meituan.android.yoda.interfaces.h<YodaResult>() { // from class: com.meituan.android.yoda.fragment.ThirdPartyVerifyFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.h
            public final /* synthetic */ void a(String str, @NonNull YodaResult yodaResult) {
                YodaResult yodaResult2 = yodaResult;
                Object[] objArr3 = {str, yodaResult2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d187aa429f308064ce5076ea4f24b3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d187aa429f308064ce5076ea4f24b3a");
                    return;
                }
                ThirdPartyVerifyFragment.this.b();
                if (yodaResult2.data != null) {
                    Map map = (Map) yodaResult2.data.get("prompt");
                    ArrayList arrayList = new ArrayList();
                    try {
                        Prompt a2 = ThirdPartyVerifyFragment.this.a(yodaResult2.data.get("prompt"));
                        if (a2 != null) {
                            ThirdPartyVerifyFragment.a(ThirdPartyVerifyFragment.this, a2.customHint);
                        }
                        ThirdPartyVerifyFragment.a(ThirdPartyVerifyFragment.this);
                        JSONArray jSONArray = new JSONArray(new Gson().toJson((List) map.get("accountInfo")));
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                arrayList.add(ThirdPartyBean.parse(jSONObject));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        if (!map.containsKey("qqAppId") || map.get("qqAppId") == null) {
                            ThirdPartyVerifyFragment.this.s = r.a(ThirdPartyVerifyFragment.this.getContext());
                        } else {
                            ThirdPartyVerifyFragment.this.s = map.get("qqAppId").toString();
                        }
                        if (map.containsKey("qqAppKey") && map.get("qqAppKey") != null) {
                            ThirdPartyVerifyFragment.this.t = map.get("qqAppKey").toString();
                        }
                        if (map.containsKey("weixinAppId") && map.get("weixinAppId") != null) {
                            ThirdPartyVerifyFragment.this.u = map.get("weixinAppId").toString();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (arrayList.isEmpty()) {
                        ThirdPartyVerifyFragment.this.a("yoda_third_part_page_launch_status", (String) null, true, 703);
                    }
                    ThirdPartyVerifyFragment.this.y.setAdapter(new c(arrayList, ThirdPartyVerifyFragment.this.A));
                } else {
                    ThirdPartyVerifyFragment.this.a("yoda_third_part_page_launch_status", (String) null, true, 703);
                }
                ThirdPartyVerifyFragment.this.d("yoda_third_part_page_launch_status", (String) null);
            }

            @Override // com.meituan.android.yoda.interfaces.h
            public final void a(String str, @NonNull Error error) {
                Object[] objArr3 = {str, error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35963767ecab5930065d4b82f773f93d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35963767ecab5930065d4b82f773f93d");
                    return;
                }
                ThirdPartyVerifyFragment.this.b();
                ThirdPartyVerifyFragment.this.a(str, error, false);
                if (ThirdPartyVerifyFragment.b(error)) {
                    ThirdPartyVerifyFragment.this.a("yoda_third_part_page_launch_status", (String) null, true, TbsListener.ErrorCode.INFO_COOKIE_SWITCH_TRANSFER);
                } else {
                    ThirdPartyVerifyFragment.this.a("yoda_third_part_page_launch_status", (String) null, true, 703);
                }
                ThirdPartyVerifyFragment.this.d("yoda_third_part_page_launch_status", (String) null);
            }
        });
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fdab17a1367c96b183d8a03f4276f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fdab17a1367c96b183d8a03f4276f42");
        } else {
            b();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1c0953ee1a04c10dc7b1a40b1816d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1c0953ee1a04c10dc7b1a40b1816d8");
        } else {
            b();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1784d8f48f8b3b6be30bcd49236bd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1784d8f48f8b3b6be30bcd49236bd4");
        } else {
            b();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8903c3dff15bacb25adb49227b25a6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8903c3dff15bacb25adb49227b25a6d0");
            return;
        }
        b();
        StringBuilder sb = new StringBuilder("onYodaResponse: verify success,time=");
        sb.append(System.currentTimeMillis());
        sb.append(",thread=");
        sb.append(Thread.currentThread().getName());
        x.a(getActivity(), (int) R.string.yoda_verify_success_string);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b935d52f66dba6874885ad25993c2736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b935d52f66dba6874885ad25993c2736");
            return;
        }
        b();
        if (a(str, error, true)) {
            return;
        }
        x.a(getActivity(), error.message);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823de699287db3c63d397b15afa63851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823de699287db3c63d397b15afa63851");
            return;
        }
        super.onAttach(context);
        this.p = (com.meituan.android.yoda.callbacks.c) context;
        this.p.a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("weixinshare");
        getActivity().registerReceiver(this.z, intentFilter);
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2498590de4a7979c7bb84db04420a5ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2498590de4a7979c7bb84db04420a5ea");
            return;
        }
        super.onDetach();
        getActivity().unregisterReceiver(this.z);
        if (this.p != null) {
            this.p.a(this);
        }
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b7be23c07e40655fa0ae299cf4ab3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b7be23c07e40655fa0ae299cf4ab3c");
        } else {
            Tencent.onActivityResultData(i, i2, intent, this.r);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2597bbc22ad2d8876044543febf8a7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2597bbc22ad2d8876044543febf8a7a5");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.d);
        hashMap.put("method", "122");
        hashMap.put(IOUtils.YODA_VERSION, x.i());
        hashMap.put("action", getAction());
        hashMap.put("custom", hashMap2);
        Statistics.getChannel("techportal").writeModelClick(getPageInfoKey(), "b_techportal_8so4k11q_mc", hashMap, "c_techportal_hcz6j0d4");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class d extends RecyclerView.s {
        public View a;
        public BaseImageView b;
        public BaseTextView c;
        public BaseTextView d;

        public d(View view) {
            super(view);
            this.a = view;
            this.b = (BaseImageView) this.a.findViewById(R.id.third_party_icon);
            this.c = (BaseTextView) this.a.findViewById(R.id.third_party_title);
            this.d = (BaseTextView) this.a.findViewById(R.id.third_party_content);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class ThirdPartyBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String nickName;
        public String thirdType;
        public int thirdTypeId;

        public ThirdPartyBean() {
        }

        public ThirdPartyBean(int i, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b09e550d359959139ed4c9f9366eb071", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b09e550d359959139ed4c9f9366eb071");
                return;
            }
            this.thirdTypeId = i;
            this.thirdType = str;
            this.nickName = str2;
        }

        public static ThirdPartyBean parse(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e72538437dd66c343e299b8a5333519", RobustBitConfig.DEFAULT_VALUE)) {
                return (ThirdPartyBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e72538437dd66c343e299b8a5333519");
            }
            try {
                ThirdPartyBean thirdPartyBean = new ThirdPartyBean();
                thirdPartyBean.nickName = jSONObject.getString("nickName");
                thirdPartyBean.thirdType = jSONObject.getString("thirdType");
                thirdPartyBean.thirdTypeId = getTypeId(thirdPartyBean.thirdType);
                return thirdPartyBean;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public static int getTypeId(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16a859318f2e80c6e5644fbd27908052", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16a859318f2e80c6e5644fbd27908052")).intValue();
            }
            if (UserCenter.OAUTH_TYPE_WEIXIN.equals(str)) {
                return 0;
            }
            return "qq".equals(str) ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class e extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82857b3bd9d67151f7ee778295b6df4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82857b3bd9d67151f7ee778295b6df4");
            } else if (intent.hasExtra("result")) {
                int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "result", -2);
                String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "code");
                String str = ThirdPartyVerifyFragment.this.c;
                com.meituan.android.yoda.monitor.log.a.a(str, "errCode and code is " + a2 + StringUtil.SPACE + a3, true);
                if (a2 == 0) {
                    if (TextUtils.isEmpty(a3)) {
                        x.a(ThirdPartyVerifyFragment.this.getActivity(), "code为null");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("thirdType", UserCenter.OAUTH_TYPE_WEIXIN);
                    hashMap.put("code", a3);
                    ThirdPartyVerifyFragment.this.a();
                    ThirdPartyVerifyFragment.a(ThirdPartyVerifyFragment.this, hashMap);
                    return;
                }
                x.a(ThirdPartyVerifyFragment.this.getActivity(), "错误,请重新操作");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {ThirdPartyVerifyFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ecab8aa6f7bd2c5cb9b7e5c0be6b307", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ecab8aa6f7bd2c5cb9b7e5c0be6b307");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd15849d4c1696d67c18522b1b921482", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd15849d4c1696d67c18522b1b921482");
            } else if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = (int) x.a(20.0f);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.a<d> {
        public static ChangeQuickRedirect a;
        List<ThirdPartyBean> b;
        b c;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(d dVar, int i) {
            d dVar2 = dVar;
            Object[] objArr = {dVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9950d905bad8542ab6a4321e12a3b09a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9950d905bad8542ab6a4321e12a3b09a");
                return;
            }
            ThirdPartyBean thirdPartyBean = this.b.get(i);
            if (thirdPartyBean != null) {
                switch (thirdPartyBean.thirdTypeId) {
                    case 0:
                        dVar2.c.setText("微信");
                        dVar2.b.setImageDrawable(ThirdPartyVerifyFragment.this.getContext().getResources().getDrawable(R.drawable.wechat_ic_normal));
                        break;
                    case 1:
                        dVar2.c.setText(Constants.SOURCE_QQ);
                        dVar2.b.setImageDrawable(ThirdPartyVerifyFragment.this.getContext().getResources().getDrawable(R.drawable.qq_ic_normal));
                        break;
                }
                dVar2.d.setText(thirdPartyBean.nickName);
                dVar2.a.setOnClickListener(h.a(this, i));
                if (dVar2.c == null || TextUtils.isEmpty(dVar2.c.getText())) {
                    return;
                }
                dVar2.a.setContentDescription(ThirdPartyVerifyFragment.this.getString(R.string.yoda_third_party_btn_content_des, dVar2.c.getText()));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9234e48477d7253882a5f76c7c26a4", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9234e48477d7253882a5f76c7c26a4") : new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.yoda_item_third_party_verify, viewGroup, false));
        }

        public c(List<ThirdPartyBean> list, b bVar) {
            Object[] objArr = {ThirdPartyVerifyFragment.this, list, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcdfaf6cfc0707e7c07881f9732b5100", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcdfaf6cfc0707e7c07881f9732b5100");
                return;
            }
            this.b = null;
            this.c = null;
            this.b = list;
            this.c = bVar;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b433bbe6960ef45635521292232fd6e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b433bbe6960ef45635521292232fd6e")).intValue();
            }
            if (this.b == null) {
                return 0;
            }
            return this.b.size();
        }
    }
}
