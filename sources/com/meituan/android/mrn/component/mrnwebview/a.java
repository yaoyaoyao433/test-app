package com.meituan.android.mrn.component.mrnwebview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansFragment;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a extends FrameLayout implements LifecycleEventListener {
    public static ChangeQuickRedirect a;
    @Nullable
    protected String b;
    protected boolean c;
    protected ReadableMap d;
    protected boolean e;
    boolean f;
    private boolean g;
    private HashMap<String, String> h;
    private int i;
    private d j;
    private TitansFragment k;

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public a(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d122fcbc39615f70d1d94e4a0634bd83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d122fcbc39615f70d1d94e4a0634bd83");
            return;
        }
        this.g = false;
        this.b = "";
        this.c = false;
        this.e = false;
        this.h = new HashMap<>();
        this.f = false;
    }

    public void setAppendCommonParams(boolean z) {
        this.f = z;
    }

    public Map getHeaders() {
        return this.h;
    }

    public void setShouldUseDeprecatedMRNWebView(boolean z) {
        this.g = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939ce62d8fa7dcedfa7160b4562df085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939ce62d8fa7dcedfa7160b4562df085");
            return;
        }
        super.onAttachedToWindow();
        if (this.g) {
            return;
        }
        String str = "about:blank";
        if (this.d != null && this.d.hasKey(Constants.TRAFFIC_URI) && this.d.getString(Constants.TRAFFIC_URI).length() > 0) {
            str = this.d.getString(Constants.TRAFFIC_URI);
        }
        com.facebook.common.logging.a.b("MRNTitansWebViewWrapper@onAttachedToWindow uri is ", str + " viewId is " + this.i);
        StringBuilder sb = new StringBuilder("urlResult ");
        sb.append(str);
        Log.e("MRNTitansWebViewWrapper", sb.toString());
        Bundle bundle = new Bundle();
        bundle.putString("webViewUrl", str);
        bundle.putString("notitlebar", "true");
        this.k = TitansFragment.newInstance(bundle, new c(this));
        try {
            FragmentTransaction beginTransaction = ((FragmentActivity) ((ao) getContext()).getBaseContext()).getSupportFragmentManager().beginTransaction();
            int i = this.i;
            TitansFragment titansFragment = this.k;
            beginTransaction.add(i, titansFragment, "fragment_" + getId()).commitNowAllowingStateLoss();
        } catch (Exception e) {
            com.facebook.common.logging.a.d("MRNTitansWebViewWrapper@onAttachedToWindow", "add titansFragment Exception ", e);
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bffd16377d13f51eea45cd24b81c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bffd16377d13f51eea45cd24b81c74");
            return;
        }
        super.onDetachedFromWindow();
        if (this.g) {
            return;
        }
        com.facebook.common.logging.a.b("MRNTitansWebViewWrapper@onDetachedFromWindow", "remove titansFragment");
        try {
            if (this.k != null) {
                ((FragmentActivity) ((ao) getContext()).getBaseContext()).getSupportFragmentManager().beginTransaction().remove(this.k).commitNowAllowingStateLoss();
            }
        } catch (Exception e) {
            com.facebook.common.logging.a.d("MRNTitansWebViewWrapper@onDetachedFromWindow", "remove titansFragment Exception", e);
        }
    }

    public final boolean a() {
        return this.e;
    }

    public void setPendingSource(ReadableMap readableMap) {
        this.d = readableMap;
        this.e = true;
    }

    public final void b() {
        this.d = null;
        this.e = false;
    }

    public ReadableMap getPendingSource() {
        return this.d;
    }

    public void setInjectedJavaScript(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.b = str;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
    }

    public final boolean c() {
        return this.c;
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dacf96e3634c292a7cb82fd6f2f18c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dacf96e3634c292a7cb82fd6f2f18c2");
        } else if (this.j.c != null) {
            ITitansContainerContext containerContext = this.j.c.getContainerContext();
            containerContext.loadJs(TitansConstants.JAVASCRIPT_PREFIX + str, new ValueCallback() { // from class: com.meituan.android.mrn.component.mrnwebview.a.1
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                }
            });
        }
    }

    @Nullable
    public String getInjectedJS() {
        return this.b == null ? "" : this.b;
    }

    public void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b119a496561c57591d5b7cd286407bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b119a496561c57591d5b7cd286407bb");
        } else {
            post(new Runnable() { // from class: com.meituan.android.mrn.component.mrnwebview.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80f7d29b797c2feb8550d892fa7f83dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80f7d29b797c2feb8550d892fa7f83dd");
                        return;
                    }
                    WritableMap a2 = d.a(a.this.getId(), a.this.getUrl());
                    a2.putString("data", str);
                    a.a(a.this, new com.meituan.android.mrn.component.mrnwebview.events.e(a.this.getId(), a2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82eb3df5bdb31c802bf3d479be88b973", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82eb3df5bdb31c802bf3d479be88b973") : (this.d != null && this.d.hasKey(Constants.TRAFFIC_URI)) ? this.d.getString(Constants.TRAFFIC_URI) : "";
    }

    public void setUseDeprecatedMRNWebView(boolean z) {
        this.g = z;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4802afa0b6e4722e2e3f968846a9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4802afa0b6e4722e2e3f968846a9de");
            return;
        }
        this.i = getId();
        this.j = new d(this);
        if (this.d == null) {
            return;
        }
        if (this.d.hasKey(Constants.TRAFFIC_URI) && this.d.getString(Constants.TRAFFIC_URI).startsWith("file://")) {
            MRNTitansWebViewManager.handleFileSchemePermission(getContext(), this.d.getString(Constants.TRAFFIC_URI));
        }
        if (this.d.hasKey("headers")) {
            ReadableMap map = this.d.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                this.h.put(nextKey, map.getString(nextKey));
            }
        }
    }

    public static void a(a aVar, com.facebook.react.uimanager.events.b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56139ad46ead4675071a1f2da4adf4c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56139ad46ead4675071a1f2da4adf4c7");
        } else {
            ((UIManagerModule) ((ReactContext) aVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(bVar);
        }
    }
}
