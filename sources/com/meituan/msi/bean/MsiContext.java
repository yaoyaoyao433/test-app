package com.meituan.msi.bean;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.api.GsonApiRequest;
import com.meituan.msi.api.c;
import com.meituan.msi.constants.ErrorTips;
import com.meituan.msi.context.b;
import com.meituan.msi.context.e;
import com.meituan.msi.context.g;
import com.meituan.msi.context.h;
import com.meituan.msi.context.i;
import com.meituan.msi.interceptor.a;
import com.meituan.msi.page.IPage;
import com.meituan.msi.privacy.permission.a;
import com.meituan.msi.provider.f;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiContext implements e {
    private static final int ACTIVITY_REQUEST_CODE = 10003;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final a apiHook;
    private volatile boolean bHasCallback;
    public final c callback;
    private com.meituan.msi.dispather.e msiDispatcher;
    public final ApiRequest request;

    public MsiContext(a<?> aVar, ApiRequest<?> apiRequest, c<?> cVar) {
        Object[] objArr = {aVar, apiRequest, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "002143223f6928154dcf355d8d98e21e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "002143223f6928154dcf355d8d98e21e");
            return;
        }
        this.bHasCallback = false;
        this.apiHook = aVar;
        this.request = apiRequest;
        this.callback = cVar;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ca9c0f20221f5f311f61b603912989b", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ca9c0f20221f5f311f61b603912989b") : this.request.getActivity();
    }

    public com.meituan.msi.context.a getActivityContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f43baa3b8e9dfb5f91b4032d48b5a6c6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.context.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f43baa3b8e9dfb5f91b4032d48b5a6c6") : this.request.getContainerContext().b;
    }

    public JsonElement getArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9136e0007aa37017b540e0c8ff46236d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9136e0007aa37017b540e0c8ff46236d");
        }
        if (this.request instanceof GsonApiRequest) {
            return ((GsonApiRequest) this.request).getArgs();
        }
        return null;
    }

    public d.b getLifecycleState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "083dc562f5e7df98a33f3df8f3e831b4", RobustBitConfig.DEFAULT_VALUE) ? (d.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "083dc562f5e7df98a33f3df8f3e831b4") : this.request.getContainerContext().b.c();
    }

    public JsonObject getUIArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1bb6ea00549d19706679e2c65c14a8", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1bb6ea00549d19706679e2c65c14a8") : this.request.getUIArgs();
    }

    public void setUIArgs(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b67280be4a14cd36f7f3f303b97419b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b67280be4a14cd36f7f3f303b97419b");
        } else {
            this.request.setUIArgs(jsonObject);
        }
    }

    public JsonObject getInnerArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bdfba2ef98a2760bd9bdfd42683d381", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bdfba2ef98a2760bd9bdfd42683d381") : this.request.getInnerArgs();
    }

    public String getCustomData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d4ea9c9ca08410307c200be7a4918be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d4ea9c9ca08410307c200be7a4918be") : this.request.getCustomData();
    }

    public final int getPageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0de67dc7092e38bee86474f6f715b01b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0de67dc7092e38bee86474f6f715b01b")).intValue();
        }
        String str = "";
        JsonObject uIArgs = getUIArgs();
        if (uIArgs != null && uIArgs.has("pageId")) {
            str = uIArgs.get("pageId").getAsString();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Integer valueOf = Integer.valueOf(str);
            if (valueOf != null) {
                return valueOf.intValue();
            }
        } catch (NumberFormatException unused) {
        }
        return -1;
    }

    @NonNull
    public ContainerInfo getContainerInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f6b3158d092a1555c1f057ad7f73b8", RobustBitConfig.DEFAULT_VALUE) ? (ContainerInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f6b3158d092a1555c1f057ad7f73b8") : this.request.getContainerContext().d.a();
    }

    public IPage getPageById(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd6151c027033d112dd74fe5875b1acb", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd6151c027033d112dd74fe5875b1acb");
        }
        ApiPortal.b containerContext = this.request.getContainerContext();
        if (containerContext.h == null) {
            com.meituan.msi.log.a.a(this.request.getName() + " getPageById fail getPageContext is null");
            return null;
        }
        return containerContext.h.a(i);
    }

    public final int getViewId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e682b39ae550f2b97a0eb8a883ab5736", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e682b39ae550f2b97a0eb8a883ab5736")).intValue();
        }
        String str = "";
        JsonObject uIArgs = getUIArgs();
        if (uIArgs != null && uIArgs.has("viewId")) {
            str = uIArgs.get("viewId").getAsString();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int parseInt = NumberUtils.parseInt(str, -1);
        return parseInt == -1 ? str.hashCode() : parseInt;
    }

    public View findCoverView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e1ef99f41d73f8522257e90f8fa193d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e1ef99f41d73f8522257e90f8fa193d") : MsiNativeViewApi.b(this, getPageId(), getViewId());
    }

    public IPage getTopPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e3119aea04a80b57dcdaf2e46507cf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e3119aea04a80b57dcdaf2e46507cf0");
        }
        ApiPortal.b containerContext = this.request.getContainerContext();
        if (containerContext.h == null) {
            com.meituan.msi.log.a.a(this.request.getName() + " getPageById fail getPageContext is null");
            return null;
        }
        return containerContext.h.a();
    }

    public h getPageContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d08c5bd717d5ee19a6239794f495fc7", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d08c5bd717d5ee19a6239794f495fc7") : this.request.getContainerContext().h;
    }

    public i getSchemaContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "782f4c001110ff775da9ad114abcfbfd", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "782f4c001110ff775da9ad114abcfbfd") : this.request.getContainerContext().i;
    }

    public com.meituan.msi.provider.a getFileProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "431857a27e7319c5b4cfb766a5c1a36e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.provider.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "431857a27e7319c5b4cfb766a5c1a36e") : this.request.getContainerContext().j;
    }

    public f getSharedPreferencesProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d65de9336ad24828a023a0171a11efe", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d65de9336ad24828a023a0171a11efe") : this.request.getContainerContext().k;
    }

    public Object getDefaultValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef66ea4a81f107b10f388a9543e612bd", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef66ea4a81f107b10f388a9543e612bd");
        }
        ApiPortal.b containerContext = this.request.getContainerContext();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = ApiPortal.b.a;
        if (PatchProxy.isSupport(objArr2, containerContext, changeQuickRedirect3, false, "2ddae5b6e7d713c9a6a9a313bfa42db0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, containerContext, changeQuickRedirect3, false, "2ddae5b6e7d713c9a6a9a313bfa42db0");
        }
        if (containerContext.g == null) {
            return null;
        }
        return containerContext.g.get(str);
    }

    public Bitmap capture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a381066f19f53818758031451f62d458", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a381066f19f53818758031451f62d458");
        }
        if (this.request.getContainerContext().h == null) {
            com.meituan.msi.log.a.a(this.request.getName() + " capture fail getPageContext is null");
            return null;
        }
        return null;
    }

    public void requestPermissions(@NonNull String[] strArr, String str, final com.meituan.msi.context.f fVar) {
        Object[] objArr = {strArr, str, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aba9881024c6076abb8295b23b2ddc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aba9881024c6076abb8295b23b2ddc5");
        } else {
            requestPermissions(strArr, str, new a.InterfaceC0498a() { // from class: com.meituan.msi.bean.MsiContext.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                public void onResult(String str2, String[] strArr2, int[] iArr, String str3) {
                    Object[] objArr2 = {str2, strArr2, iArr, str3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e1aba6c0dac453261364875d68e60d75", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e1aba6c0dac453261364875d68e60d75");
                    }
                }
            });
        }
    }

    public com.meituan.msi.context.d getContainerInfoContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b50616a9ddbe30482c2a49cf0246e584", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.context.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b50616a9ddbe30482c2a49cf0246e584") : this.request.getContainerContext().d;
    }

    public com.meituan.msi.dispather.e getMsiDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "201883cb724d1f851eafcc792ccef405", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.dispather.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "201883cb724d1f851eafcc792ccef405") : getEventDispatcher();
    }

    @NonNull
    public com.meituan.msi.dispather.e getEventDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe91baf3b082f14b9b8b4bc1ec00e4f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.dispather.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe91baf3b082f14b9b8b4bc1ec00e4f4");
        }
        if (this.msiDispatcher != null) {
            return this.msiDispatcher;
        }
        return this.request.getContainerContext().f;
    }

    public g getNavActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c1051dc24451874e4d130fe35e5c410", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c1051dc24451874e4d130fe35e5c410") : this.request.getContainerContext().c;
    }

    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123c45f005cd7bd422e908850571b53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123c45f005cd7bd422e908850571b53d");
        } else {
            this.request.getContainerContext().b.a(i, intent, new b() { // from class: com.meituan.msi.bean.MsiContext.2
                public static ChangeQuickRedirect changeQuickRedirect;
                public boolean isDone;

                @Override // com.meituan.msi.context.b
                public void onActivityResult(int i2, Intent intent2) {
                    Object[] objArr2 = {Integer.valueOf(i2), intent2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7814f9b0e3974aa4d20f520a555df62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7814f9b0e3974aa4d20f520a555df62");
                    } else if (this.isDone) {
                        com.meituan.msi.log.a.a("business call onActivityResult too many times");
                    } else {
                        com.meituan.msi.api.a apiCall = MsiContext.this.request.getApiCall();
                        ApiRequest apiRequest = MsiContext.this.request;
                        Object[] objArr3 = {Integer.valueOf(i2), intent2, apiRequest};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msi.api.a.a;
                        if (PatchProxy.isSupport(objArr3, apiCall, changeQuickRedirect4, false, "d7875513e0df655748fe3d20dabdd6c7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, apiCall, changeQuickRedirect4, false, "d7875513e0df655748fe3d20dabdd6c7");
                        } else if (apiCall.b instanceof com.meituan.msi.api.g) {
                            ((com.meituan.msi.api.g) apiCall.b).a(i2, intent2, new MsiContext(apiCall.d, apiRequest, apiRequest.callback));
                        }
                        this.isDone = true;
                    }
                }

                @Override // com.meituan.msi.context.b
                public void onFail(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c9b708cb15cc01d5d7451a55f3c5220f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c9b708cb15cc01d5d7451a55f3c5220f");
                        return;
                    }
                    MsiContext msiContext = MsiContext.this;
                    msiContext.onError(i2 + StringUtil.SPACE + str);
                }
            });
        }
    }

    public void startActivityForResult(Intent intent, final b bVar) {
        Object[] objArr = {intent, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65baf95a59cc2ed6827ff0541c0177ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65baf95a59cc2ed6827ff0541c0177ea");
        } else {
            this.request.getContainerContext().b.a(10003, intent, new b() { // from class: com.meituan.msi.bean.MsiContext.3
                public static ChangeQuickRedirect changeQuickRedirect;
                public boolean isDone;

                @Override // com.meituan.msi.context.b
                public void onActivityResult(int i, Intent intent2) {
                    Object[] objArr2 = {Integer.valueOf(i), intent2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28f9169ba6952b1a54f3bf2069b30431", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28f9169ba6952b1a54f3bf2069b30431");
                    } else if (this.isDone) {
                        com.meituan.msi.log.a.a("business call onActivityResult too many times");
                    } else {
                        if (bVar != null) {
                            bVar.onActivityResult(i, intent2);
                        }
                        this.isDone = true;
                    }
                }

                @Override // com.meituan.msi.context.b
                public void onFail(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c028355555b0173111c2a85a18ae3d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c028355555b0173111c2a85a18ae3d2");
                    } else if (this.isDone) {
                        com.meituan.msi.log.a.a("business call onActivityResult too many times. onFail");
                    } else {
                        if (bVar != null) {
                            bVar.onFail(i, str);
                        }
                        this.isDone = true;
                    }
                }
            });
        }
    }

    public void requestPermissions(@NonNull String[] strArr, String str, a.InterfaceC0498a interfaceC0498a) {
        com.meituan.msi.privacy.permission.a aVar;
        Object[] objArr = {strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e015365bd8222109468d65a9d61b5a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e015365bd8222109468d65a9d61b5a8a");
            return;
        }
        ApiPortal.b containerContext = this.request.getContainerContext();
        if (containerContext != null && (aVar = containerContext.m) != null) {
            aVar.a(containerContext.b.a(), strArr, str, interfaceC0498a);
        } else {
            interfaceC0498a.onResult(str, strArr, null, "innerContext or msiPermissionGuard is null");
        }
    }

    @Override // com.meituan.msi.context.e
    public void onError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a271f2f02e56c3d398a518a005a5d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a271f2f02e56c3d398a518a005a5d22");
        } else {
            onError(i, str, (Map) null);
        }
    }

    public void onError(int i, String str, Map map) {
        Object[] objArr = {Integer.valueOf(i), str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39fb3dbe67656ce3a9447c5321ad04cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39fb3dbe67656ce3a9447c5321ad04cf");
        } else if (this.callback == null || hasCallback()) {
        } else {
            this.bHasCallback = true;
            ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(this.request, i, str, ApiResponse.a.callbackValue);
            if (map == null) {
                map = jsonObjectToMap(this.request.getInnerArgs());
            }
            negativeResponse.setInnerData(map);
            this.callback.a(negativeResponse.originBack ? negativeResponse : negativeResponse.toJson());
            com.meituan.msi.log.a.a(negativeResponse);
            com.meituan.msi.log.a.b(negativeResponse);
        }
    }

    public void onError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0049a2a24b57fb4841eef92d82ab69e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0049a2a24b57fb4841eef92d82ab69e4");
        } else {
            onError(500, str);
        }
    }

    public void onError(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842859991fecfe84d0a2dc1967b17cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842859991fecfe84d0a2dc1967b17cb5");
        } else {
            onError(500, str, map);
        }
    }

    @Override // com.meituan.msi.context.e
    public <T> void onSuccess(T t) {
        Map<String, Object> map;
        T t2;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a05e718caa7a5d89a44c3119425fc2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a05e718caa7a5d89a44c3119425fc2f");
        } else if (this.callback == null || hasCallback()) {
        } else {
            this.bHasCallback = true;
            try {
                if (t instanceof ResponseWithInnerData) {
                    map = ((ResponseWithInnerData) t).innerData;
                    t2 = ((ResponseWithInnerData) t).response;
                } else {
                    map = null;
                    t2 = t;
                }
                Object obj = t2;
                if (this.apiHook != null) {
                    obj = this.apiHook.a(this.request, t2);
                }
                if (map == null) {
                    map = jsonObjectToMap(this.request.getInnerArgs());
                }
                ApiResponse positiveResponse = ApiResponse.positiveResponse(this.request, obj, ApiResponse.a.callbackValue);
                positiveResponse.setInnerData(map);
                this.callback.b(positiveResponse.originBack ? positiveResponse : positiveResponse.toJson());
                com.meituan.msi.log.a.a(positiveResponse);
            } catch (Exception e) {
                if (com.meituan.msi.a.i()) {
                    e.printStackTrace();
                }
                com.meituan.msi.log.a.b(ApiResponse.negativeResponse(null, e, ApiResponse.a.callbackValue));
                this.bHasCallback = false;
            }
        }
    }

    public void dispatchEvent(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b28e3ffb70189bb8d0ca770b3d0f285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b28e3ffb70189bb8d0ca770b3d0f285");
        } else {
            dispatchEvent(null, str, obj, null);
        }
    }

    public void dispatchEvent(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4f890bf8bcd59cada750a580d26e745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4f890bf8bcd59cada750a580d26e745");
        } else {
            dispatchEvent(str, str2, obj, null);
        }
    }

    public void dispatchEvent(String str, Object obj, String str2) {
        Object[] objArr = {str, obj, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd53ab779e2316e7a05bf662c0cd8c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd53ab779e2316e7a05bf662c0cd8c3b");
        } else {
            dispatchEvent(null, str, obj, str2);
        }
    }

    public void dispatchEvent(String str, String str2, Object obj, String str3) {
        Object[] objArr = {str, str2, obj, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a728595eb4946ae911462a71844da3a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a728595eb4946ae911462a71844da3a4");
            return;
        }
        BroadcastEvent broadcastEvent = new BroadcastEvent(str2, str, obj);
        if (!TextUtils.isEmpty(str3)) {
            broadcastEvent.setTaskId(str3);
        }
        dispatchEvent(broadcastEvent);
    }

    private void dispatchEvent(BroadcastEvent broadcastEvent) {
        Object[] objArr = {broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71852203fc0b4e08fc6511445133a8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71852203fc0b4e08fc6511445133a8f2");
        } else if (broadcastEvent == null) {
        } else {
            addCommonUIArgs(broadcastEvent);
            getEventDispatcher().a(broadcastEvent);
        }
    }

    private void addCommonUIArgs(BroadcastEvent broadcastEvent) {
        JsonObject uIArgs;
        Object[] objArr = {broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4b3c6f22bd706cd9a19c5f2eeefcea5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4b3c6f22bd706cd9a19c5f2eeefcea5");
        } else if (broadcastEvent == null || (uIArgs = getUIArgs()) == null) {
        } else {
            if (uIArgs.has("pageId")) {
                broadcastEvent.addUiData("pageId", uIArgs.get("pageId").getAsString());
            }
            if (uIArgs.has("viewId")) {
                broadcastEvent.addUiData("viewId", uIArgs.get("viewId").getAsString());
            }
        }
    }

    public void onError(ErrorTips errorTips) {
        Object[] objArr = {errorTips};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5865d612c9f4426fa9498104df8822cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5865d612c9f4426fa9498104df8822cd");
            return;
        }
        onError(500, errorTips.errorCode + CommonConstant.Symbol.COLON + errorTips.errorMsg + StringUtil.SPACE + errorTips.errorDesc);
    }

    public <T> void onError(int i, String str, T t) {
        Object[] objArr = {Integer.valueOf(i), str, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194bb68c766a7be087f2f54a842d68e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194bb68c766a7be087f2f54a842d68e7");
        } else if (this.callback == null || hasCallback()) {
        } else {
            this.bHasCallback = true;
            ApiResponse negativeResponse = ApiResponse.negativeResponse(this.request, i, str, t, ApiResponse.a.callbackValue);
            negativeResponse.setInnerData(jsonObjectToMap(this.request.getInnerArgs()));
            this.callback.a(negativeResponse.originBack ? negativeResponse : negativeResponse.toJson());
            com.meituan.msi.log.a.a(negativeResponse);
            com.meituan.msi.log.a.b(negativeResponse);
        }
    }

    private boolean hasCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b124aef0b071697a7476242a768c7e5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b124aef0b071697a7476242a768c7e5e")).booleanValue();
        }
        if (this.bHasCallback) {
            com.meituan.msi.log.a.a(this.request.getName() + ":callback is used more than once");
            return true;
        }
        return false;
    }

    public static Map<String, Object> jsonObjectToMap(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8629f73c71b949c926150661c0c72831", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8629f73c71b949c926150661c0c72831");
        }
        if (jsonObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            Set<String> keySet = jsonObject.keySet();
            if (keySet != null && keySet.size() > 0) {
                for (String str : keySet) {
                    hashMap.put(str, jsonObject.get(str));
                }
            }
        } catch (Exception e) {
            com.meituan.msi.log.a.a("jsonObjectToMap:" + e.getMessage());
        }
        return hashMap;
    }

    public void setEventDispatcher(com.meituan.msi.dispather.e eVar) {
        this.msiDispatcher = eVar;
    }
}
