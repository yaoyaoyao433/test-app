package com.meituan.android.mrn.component.list.turbo;

import android.support.annotation.Keep;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class TurboNode implements Serializable {
    public static final String CHILDREN = "children";
    public static final String EVENT_ID = "tagId";
    public static final String MODULE_NAME = "className";
    public static final String PARENT_TAG = "parentTag";
    public static final String PROPS = "props";
    public static final String REACT_TAG = "reactTag";
    public static final String ROOT_TAG = "rootTag";
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient List<TurboNode> dynamicNodes;
    public transient List<TurboNode> forContainers;
    public transient TurboNode forParent;
    public transient j helper;
    @SerializedName("children")
    public ArrayList<TurboNode> mChildren;
    public int mEventId;
    @SerializedName("className")
    public String mModuleName;
    public transient TurboNode mParentNode;
    public int mParentTag;
    @SerializedName("props")
    public ReadableMap mProps;
    @SerializedName("tagId")
    public int mReactTag;
    @SerializedName("rootTag")
    public int mRootTag;
    public String mTemplateId;
    public transient ReadableMap rawProps;
    public int viewType;

    public TurboNode() {
        this.mReactTag = -1;
        this.mModuleName = "";
        this.mRootTag = -1;
        this.mParentTag = -1;
        this.mChildren = new ArrayList<>();
        this.mEventId = -1;
    }

    public TurboNode(TurboNode turboNode) {
        this.mReactTag = -1;
        this.mModuleName = "";
        this.mRootTag = -1;
        this.mParentTag = -1;
        this.mChildren = new ArrayList<>();
        this.mEventId = -1;
        this.mProps = turboNode.mProps;
        this.mTemplateId = turboNode.mTemplateId;
        this.mParentNode = turboNode.mParentNode;
        this.mModuleName = turboNode.mModuleName;
        this.rawProps = turboNode.rawProps;
        this.mEventId = turboNode.mEventId;
        this.mParentTag = turboNode.mParentTag;
        this.mRootTag = turboNode.mRootTag;
        this.mReactTag = turboNode.mReactTag;
        this.mChildren = new ArrayList<>(turboNode.mChildren);
    }
}
