package com.meituan.android.common.statistics.tag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class TagList {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TagNode current;
    private List<TagNode> nodeList;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface TagNodeRemoveListener {
        void onTagNodeRemoved(String str);
    }

    public TagList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a2a5bc77232015021afc17d0f375f9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a2a5bc77232015021afc17d0f375f9e");
        } else {
            this.nodeList = new ArrayList();
        }
    }

    public final List<TagNode> getNodeList() {
        return this.nodeList;
    }

    public final void add(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9981f0a7d0bf3270508be43aeb08cdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9981f0a7d0bf3270508be43aeb08cdb");
            return;
        }
        TagNode tagNode = null;
        if (z && (tagNode = get(str2)) == null) {
            return;
        }
        this.current = new TagNode(str, tagNode);
        this.nodeList.add(this.current);
        if (!z || tagNode == null) {
            return;
        }
        tagNode.addChildTagNode(this.current);
    }

    public final TagNode get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc17e469bab9a252d025278d464c3a5c", 6917529027641081856L) ? (TagNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc17e469bab9a252d025278d464c3a5c") : this.nodeList.get(i);
    }

    public final TagNode get(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c81d912e31fe3dd01fefe52b8702a621", 6917529027641081856L)) {
            return (TagNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c81d912e31fe3dd01fefe52b8702a621");
        }
        TagNode tagNode = null;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            Iterator<TagNode> it = this.nodeList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TagNode next = it.next();
                if (next != null && str.equals(next.getPageName())) {
                    tagNode = next;
                    break;
                }
            }
        }
        return tagNode;
    }

    public final TagNode getCurrent() {
        return this.current;
    }

    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8313c86439b1238f3dd1cfb9644db69", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8313c86439b1238f3dd1cfb9644db69")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        for (TagNode tagNode : this.nodeList) {
            if (str.equals(tagNode.getPageName())) {
                return true;
            }
        }
        return false;
    }

    public final void removeToLast(String str, TagNodeRemoveListener tagNodeRemoveListener) {
        Object[] objArr = {str, tagNodeRemoveListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f14c4e6c65877468dea60d2663932be0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f14c4e6c65877468dea60d2663932be0");
            return;
        }
        TagNode tagNode = get(str);
        int size = this.nodeList.size();
        if (tagNode != null) {
            size = this.nodeList.indexOf(tagNode);
        }
        LinkedList linkedList = new LinkedList();
        while (size < this.nodeList.size()) {
            TagNode tagNode2 = this.nodeList.get(size);
            if (tagNode2 != null) {
                tagNode2.remove();
                linkedList.add(tagNode2);
                if (tagNodeRemoveListener != null) {
                    tagNodeRemoveListener.onTagNodeRemoved(str);
                }
            }
            size++;
        }
        this.nodeList.removeAll(linkedList);
    }

    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92901d7f54ece845a5f487c3ff2ad9c", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92901d7f54ece845a5f487c3ff2ad9c")).intValue() : this.nodeList.size();
    }
}
