package com.sankuai.waimai.platform.config.bean;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TreeNode {
    private static final int NO_PARENT = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<TreeNode> children;
    private String desc;
    private int id;
    private boolean mDefaultValue;
    private boolean mIsShowSwitch;
    private String mKey;
    private OnClickBooleanHandler mOnClickBooleanHandler;
    private View.OnClickListener mOnClickListener;
    private View.OnLongClickListener mOnLongClickListener;
    private TreeNode mParentNode;
    private boolean mShown;
    private String title;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface OnClickBooleanHandler {
        boolean onClick(String str, boolean z, boolean z2);
    }

    public TreeNode(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "796e24b79a5742ca82ce34909156b310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "796e24b79a5742ca82ce34909156b310");
            return;
        }
        this.children = new ArrayList();
        this.title = str;
    }

    public boolean isRoot() {
        return this.mParentNode == null;
    }

    public boolean isParentExpand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3d4e8c7163fcb411e7aac1c937f5b0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3d4e8c7163fcb411e7aac1c937f5b0d")).booleanValue();
        }
        if (this.mParentNode != null) {
            return this.mParentNode.isExpand();
        }
        return false;
    }

    public TreeNode setIsShowSwitch(boolean z) {
        this.mIsShowSwitch = z;
        return this;
    }

    public boolean isLeaf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ae505ca530df8ef48a72bb7339ac2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ae505ca530df8ef48a72bb7339ac2a")).booleanValue() : this.children.size() == 0;
    }

    public int getDepth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec09a0cabcfd66c59f57232eea94ac4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec09a0cabcfd66c59f57232eea94ac4e")).intValue();
        }
        if (this.mParentNode == null) {
            return 0;
        }
        return this.mParentNode.getDepth() + 1;
    }

    public TreeNode setExpand(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9b034fa2eddb906785bfb2d7751d9e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (TreeNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9b034fa2eddb906785bfb2d7751d9e3");
        }
        if (this.children.size() <= 0) {
            return this;
        }
        if (z) {
            for (TreeNode treeNode : this.children) {
                treeNode.setShown(true);
            }
        } else {
            for (TreeNode treeNode2 : this.children) {
                treeNode2.setShown(false);
            }
        }
        return this;
    }

    public int getId() {
        return this.id;
    }

    public TreeNode setId(int i) {
        this.id = i;
        return this;
    }

    public int getParentId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a68554dea76574b661d4d5acae5d201", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a68554dea76574b661d4d5acae5d201")).intValue();
        }
        if (this.mParentNode == null) {
            return -1;
        }
        return this.mParentNode.getId();
    }

    public boolean isExpand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f14d5e41c0b75d5663b98258a7147621", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f14d5e41c0b75d5663b98258a7147621")).booleanValue() : this.children.size() > 0 && this.children.get(0).isShown();
    }

    public boolean isShown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7487548e018c1d1090c842fa2ddce656", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7487548e018c1d1090c842fa2ddce656")).booleanValue();
        }
        if (this.mParentNode != null) {
            return this.mShown && this.mParentNode.isShown();
        }
        return this.mShown;
    }

    public void setShown(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "552555799b61817c86429ce4877607b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "552555799b61817c86429ce4877607b8");
            return;
        }
        this.mShown = z;
        if (z || this.children.size() <= 0) {
            return;
        }
        for (TreeNode treeNode : this.children) {
            treeNode.setShown(false);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public TreeNode setTitle(String str) {
        this.title = str;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public TreeNode setDesc(String str) {
        this.desc = str;
        return this;
    }

    public List<TreeNode> getChildren() {
        return this.children;
    }

    public TreeNode addChild(TreeNode treeNode) {
        Object[] objArr = {treeNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c457248cd1e91cb428ddb515ff1c890", RobustBitConfig.DEFAULT_VALUE)) {
            return (TreeNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c457248cd1e91cb428ddb515ff1c890");
        }
        if (treeNode == null) {
            return this;
        }
        this.children.add(treeNode);
        treeNode.mParentNode = this;
        return this;
    }

    public TreeNode addChildren(List<TreeNode> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0941f185d516f52eba133eaab87ad5a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (TreeNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0941f185d516f52eba133eaab87ad5a8");
        }
        if (!d.a(list)) {
            for (TreeNode treeNode : list) {
                addChild(treeNode);
            }
        }
        return this;
    }

    public TreeNode getParentNode() {
        return this.mParentNode;
    }

    public void setParentNode(TreeNode treeNode) {
        this.mParentNode = treeNode;
    }

    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    public TreeNode setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        return this;
    }

    public View.OnLongClickListener getOnLongClickListener() {
        return this.mOnLongClickListener;
    }

    public TreeNode setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnLongClickListener = onLongClickListener;
        return this;
    }

    public boolean isShowSwitch() {
        return this.mIsShowSwitch;
    }

    public TreeNode setShowSwitch(boolean z) {
        this.mIsShowSwitch = z;
        return this;
    }

    public OnClickBooleanHandler getOnClickBooleanHandler() {
        return this.mOnClickBooleanHandler;
    }

    public TreeNode setOnClickBooleanHandler(OnClickBooleanHandler onClickBooleanHandler) {
        this.mOnClickBooleanHandler = onClickBooleanHandler;
        return this;
    }

    public String getKey() {
        return this.mKey;
    }

    public TreeNode setKey(String str) {
        this.mKey = str;
        return this;
    }

    public TreeNode setKey(String str, boolean z) {
        this.mKey = str;
        this.mDefaultValue = z;
        return this;
    }

    public boolean isDefaultValue() {
        return this.mDefaultValue;
    }
}
