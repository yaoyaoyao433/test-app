package com.dianping.shield.components.template;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.d;
import com.dianping.dataservice.mapi.c;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.f;
import com.dianping.dataservice.mapi.g;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002B'\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\"\u0010\u0019\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u001c\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\u001d\u001a\u00020\u00152\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0015H\u0002R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/dianping/shield/components/template/CommonTemplateAgent;", "Lcom/dianping/agentsdk/agent/HoloAgent;", "Lcom/dianping/dataservice/RequestHandler;", "Lcom/dianping/dataservice/mapi/MApiRequest;", "", "Lcom/dianping/dataservice/mapi/MApiResponse;", "fragment", "Landroid/support/v4/app/Fragment;", "bridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "defaultKey", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "handler", SocialConstants.TYPE_REQUEST, "whiteBoardConfigKey", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestFailed", HiAnalyticsConstant.Direction.REQUEST, "resp", "onRequestFinish", "queryRemoteList", "keys", "", "([Ljava/lang/String;)V", "setKeyToWhiteboard", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CommonTemplateAgent extends HoloAgent implements d<e<Object>, f> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<String> defaultKey;
    private d<e<Object>, f> handler;
    private e<?> request;
    private String whiteBoardConfigKey;

    public CommonTemplateAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf0cea01922e30d6b9260a5e86f12e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf0cea01922e30d6b9260a5e86f12e9");
        } else {
            this.handler = this;
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public final void onCreate(@Nullable Bundle bundle) {
        g mapiService;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "023c31095bb76408055327cbcbc872ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "023c31095bb76408055327cbcbc872ff");
            return;
        }
        super.onCreate(bundle);
        HashMap<String, Serializable> hashMap = this.arguments;
        Serializable serializable = hashMap != null ? hashMap.get("url") : null;
        if (!(serializable instanceof String)) {
            serializable = null;
        }
        String str = (String) serializable;
        if (str != null) {
            this.request = mapiGet(this, str, c.DISABLED);
        } else {
            HashMap<String, Serializable> hashMap2 = this.arguments;
            Serializable serializable2 = hashMap2 != null ? hashMap2.get(SocialConstants.TYPE_REQUEST) : null;
            if (!(serializable2 instanceof e)) {
                serializable2 = null;
            }
            e<?> eVar = (e) serializable2;
            if (eVar != null) {
                this.request = eVar;
            }
        }
        HashMap<String, Serializable> hashMap3 = this.arguments;
        Serializable serializable3 = hashMap3 != null ? hashMap3.get("handler") : null;
        if (!(serializable3 instanceof d)) {
            serializable3 = null;
        }
        d<e<Object>, f> dVar = (d) serializable3;
        if (dVar != null) {
            this.handler = dVar;
        }
        if (this.request != null && (mapiService = mapiService()) != null) {
            mapiService.exec(this.request, this.handler);
        }
        HashMap<String, Serializable> hashMap4 = this.arguments;
        Serializable serializable4 = hashMap4 != null ? hashMap4.get("defaultkey") : null;
        if (!(serializable4 instanceof ArrayList)) {
            serializable4 = null;
        }
        this.defaultKey = (ArrayList) serializable4;
        HashMap<String, Serializable> hashMap5 = this.arguments;
        this.whiteBoardConfigKey = (String) (hashMap5 != null ? hashMap5.get("wbConfigKey") : null);
    }

    @Override // com.dianping.dataservice.d
    public final void onRequestFailed(@Nullable e<Object> eVar, @Nullable f fVar) {
        String[] strArr;
        Object[] objArr = {eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d40fe33dca5df7cd7dead58ef3250ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d40fe33dca5df7cd7dead58ef3250ba");
        } else if (eVar == this.request) {
            setKeyToWhiteboard();
            ArrayList<String> arrayList = this.defaultKey;
            if (arrayList != null) {
                ArrayList<String> arrayList2 = arrayList;
                if (arrayList2 == null) {
                    throw new o("null cannot be cast to non-null type java.util.Collection<T>");
                }
                Object[] array = arrayList2.toArray(new String[0]);
                if (array == null) {
                    throw new o("null cannot be cast to non-null type kotlin.Array<T>");
                }
                strArr = (String[]) array;
            } else {
                strArr = null;
            }
            queryRemoteList(strArr);
        }
    }

    @Override // com.dianping.dataservice.d
    public final void onRequestFinish(@Nullable e<Object> eVar, @Nullable f fVar) {
        Object[] objArr = {eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f69ac9184ade079d7a64240baa8a22f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f69ac9184ade079d7a64240baa8a22f1");
        } else if (eVar == this.request) {
            String[] strArr = null;
            Object a = fVar != null ? fVar.a() : null;
            if (!(a instanceof DPObject)) {
                a = null;
            }
            DPObject dPObject = (DPObject) a;
            if (dPObject != null) {
                String e = dPObject.e("templateKey");
                ArrayList<String> arrayList = this.defaultKey;
                if (arrayList != null) {
                    arrayList.add(0, e);
                }
                setKeyToWhiteboard();
                ArrayList<String> arrayList2 = this.defaultKey;
                if (arrayList2 != null) {
                    ArrayList<String> arrayList3 = arrayList2;
                    if (arrayList3 == null) {
                        throw new o("null cannot be cast to non-null type java.util.Collection<T>");
                    }
                    Object[] array = arrayList3.toArray(new String[0]);
                    if (array == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    strArr = (String[]) array;
                }
                queryRemoteList(strArr);
            }
        }
    }

    private final void queryRemoteList(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29d8e9a28f010202f65e33ef00fe73a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29d8e9a28f010202f65e33ef00fe73a8");
        } else {
            getWhiteBoard().a(WhiteBoardKeyConsts.PARAM_PAGE_REMOTE_LIST, com.dianping.eunomia.f.a().a(getContext(), strArr));
        }
    }

    private final void setKeyToWhiteboard() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2104daed06b8baff32c42625baf82b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2104daed06b8baff32c42625baf82b7");
            return;
        }
        CommonTemplateAgent commonTemplateAgent = this;
        ArrayList<String> arrayList = commonTemplateAgent.defaultKey;
        if (arrayList != null) {
            for (String str : arrayList) {
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    String str3 = commonTemplateAgent.whiteBoardConfigKey;
                    if (str3 != null) {
                        commonTemplateAgent.getWhiteBoard().a(str3, str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca8f7ff97a84ccdf39c1dc79dcd3a909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca8f7ff97a84ccdf39c1dc79dcd3a909");
            return;
        }
        g mapiService = mapiService();
        if (mapiService != null) {
            mapiService.abort(this.request, this.handler, true);
        }
        super.onDestroy();
    }
}
