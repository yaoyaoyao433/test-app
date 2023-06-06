package com.meituan.msc.mmpviews.list.msclist;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.msc.mmpviews.list.msclist.data.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MSCListNode implements Serializable {
    public static final String CHILDREN = "children";
    public static final String EVENT_ID = "tagId";
    public static final String MODULE_NAME = "viewClass";
    public static final String PARENT_TAG = "parentTag";
    public static final String PROPS = "props";
    public static final String REACT_TAG = "reactTag";
    public static final String ROOT_TAG = "rootTag";
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean ifVal;
    public boolean isForChild;
    public String key;
    @SerializedName("children")
    public ArrayList<MSCListNode> mChildren;
    public transient MSCListNode mParentNode;
    @SerializedName("props")
    public JSONObject mProps;
    @SerializedName("tagId")
    public int mReactTag;
    @SerializedName("rootTag")
    public int mRootTag;
    public int mTemplateTag;
    @SerializedName(MODULE_NAME)
    public String mViewClass;
    public b.a rawData;
    public g templateNode;
    public transient com.meituan.msc.uimanager.list.c uiImplementation;

    public MSCListNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5da3ece7333c128d6d1dd555d885c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5da3ece7333c128d6d1dd555d885c0");
            return;
        }
        this.mReactTag = -1;
        this.mViewClass = "";
        this.mRootTag = -1;
        this.mChildren = new ArrayList<>();
    }

    public static MSCListNode createTree(MSCListNode mSCListNode, a aVar) {
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9bf24c85d3837c4ea3bfd8eb619d501", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListNode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9bf24c85d3837c4ea3bfd8eb619d501");
        }
        if (mSCListNode.templateNode == null) {
            return null;
        }
        mSCListNode.templateNode.a(mSCListNode, aVar);
        return mSCListNode;
    }
}
