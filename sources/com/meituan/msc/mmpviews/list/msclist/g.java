package com.meituan.msc.mmpviews.list.msclist;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g extends f {
    public static ChangeQuickRedirect h;
    protected String i;

    public g(JSONObject jSONObject, f fVar, String str) {
        super(jSONObject, fVar, str);
        Object[] objArr = {jSONObject, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e662c6047ecd9bd537d0f8f29ef9aed2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e662c6047ecd9bd537d0f8f29ef9aed2");
            return;
        }
        try {
            this.i = jSONObject.getString(MSCListNode.MODULE_NAME);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.mmpviews.list.msclist.f
    public final void a(MSCListNode mSCListNode, a aVar) {
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38b0886b0534f63cac260aa06de25700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38b0886b0534f63cac260aa06de25700");
        } else if (this.d != null && this.d.size() != 0) {
            for (f fVar : this.d) {
                if (fVar instanceof g) {
                    MSCListNode c = ((g) fVar).c(mSCListNode, aVar);
                    mSCListNode.mChildren.add(c);
                    fVar.a(c, aVar);
                } else if (fVar instanceof d) {
                    fVar.a(mSCListNode, aVar);
                }
            }
        }
    }

    public MSCListNode c(MSCListNode mSCListNode, a aVar) {
        String valueOf;
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e267641cd6ac8ad72165b8ff9ada6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e267641cd6ac8ad72165b8ff9ada6e");
        }
        MSCListNode mSCListNode2 = new MSCListNode();
        mSCListNode2.mProps = b(mSCListNode, aVar);
        mSCListNode2.mViewClass = this.i;
        mSCListNode2.isForChild = aVar.b();
        if (aVar.b()) {
            valueOf = this.g + "#" + aVar.c;
        } else {
            valueOf = String.valueOf(this.g);
        }
        mSCListNode2.key = valueOf;
        int i = this.g;
        mSCListNode2.mTemplateTag = i;
        mSCListNode2.mReactTag = i;
        mSCListNode2.templateNode = this;
        mSCListNode2.uiImplementation = mSCListNode.uiImplementation;
        mSCListNode2.mParentNode = mSCListNode;
        f(mSCListNode2, aVar);
        return mSCListNode2;
    }

    public final MSCListNode e(MSCListNode mSCListNode, a aVar) {
        String valueOf;
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915bd14721e9401000652494e5193e21", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915bd14721e9401000652494e5193e21");
        }
        MSCListNode mSCListNode2 = new MSCListNode();
        mSCListNode2.mProps = new JSONObject();
        mSCListNode2.mViewClass = this.i;
        mSCListNode2.isForChild = aVar.b();
        if (aVar.b()) {
            valueOf = this.g + "#" + aVar.c;
        } else {
            valueOf = String.valueOf(this.g);
        }
        mSCListNode2.key = valueOf;
        int i = this.g;
        mSCListNode2.mTemplateTag = i;
        mSCListNode2.mReactTag = i;
        mSCListNode2.templateNode = this;
        mSCListNode2.uiImplementation = mSCListNode.uiImplementation;
        mSCListNode2.mParentNode = mSCListNode;
        return mSCListNode2;
    }

    public final void f(MSCListNode mSCListNode, a aVar) {
        String a;
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7faad37098a34119244c9fa56222278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7faad37098a34119244c9fa56222278");
            return;
        }
        if (mSCListNode.mProps != null && mSCListNode.mProps.has(CommonConstant.File.CLASS)) {
            String str = (String) mSCListNode.mProps.opt(CommonConstant.File.CLASS);
            b bVar = aVar.g;
            String str2 = bVar.b;
            if (bVar.a(str2)) {
                HashMap<String, String> b = bVar.b(str2);
                if (b.containsKey(str)) {
                    a = b.get(str);
                } else {
                    a = MPLayoutShadowNode.a(str, str2);
                    b.put(str, a);
                    bVar.a(str2, b);
                }
            } else {
                HashMap<String, String> hashMap = new HashMap<>();
                a = MPLayoutShadowNode.a(str, str2);
                hashMap.put(str, a);
                bVar.a(str2, hashMap);
            }
            try {
                mSCListNode.mProps.put(CommonConstant.File.CLASS, a);
            } catch (JSONException e) {
                throw new com.meituan.msc.common.b(e);
            }
        }
        for (String str3 : Arrays.asList(RaptorUploaderImpl.SRC, ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
            if (mSCListNode.mProps != null && mSCListNode.mProps.has(str3) && (mSCListNode.mProps.opt(str3) instanceof String) && !((String) mSCListNode.mProps.opt(str3)).startsWith("http")) {
                String str4 = (String) mSCListNode.mProps.opt(str3);
                ReactApplicationContext e2 = mSCListNode.uiImplementation.e();
                if (e2 == null) {
                    return;
                }
                try {
                    mSCListNode.mProps.put(str3, "mscfile://msc_" + e2.getRuntimeDelegate().getAppId() + str4);
                } catch (JSONException e3) {
                    throw new com.meituan.msc.common.b(e3);
                }
            }
        }
    }
}
