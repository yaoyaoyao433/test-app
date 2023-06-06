package com.sankuai.waimai.mach.render;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.BaseJavaModule;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.e;
import com.sankuai.waimai.mach.component.f;
import com.sankuai.waimai.mach.node.VirtualNode;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;

    public List<Class<? extends com.sankuai.waimai.mach.component.base.a>> a() {
        return null;
    }

    @Override // com.sankuai.waimai.mach.render.c
    public final com.sankuai.waimai.mach.node.a a(VirtualNode virtualNode) {
        Object[] objArr = {virtualNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90ed7c2e12362fda97645390cf4262b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90ed7c2e12362fda97645390cf4262b") : a(virtualNode, (com.sankuai.waimai.mach.node.a<?>) null);
    }

    private com.sankuai.waimai.mach.node.a<?> a(VirtualNode virtualNode, @Nullable com.sankuai.waimai.mach.node.a<?> aVar) {
        com.sankuai.waimai.mach.node.a<?> aVar2;
        Object[] objArr = {virtualNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92fd43b03dc9ca0d37496e41777a9ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92fd43b03dc9ca0d37496e41777a9ec5");
        }
        if (Constants.EventType.VIEW.equals(virtualNode.getMachTag())) {
            aVar2 = new com.sankuai.waimai.mach.node.a<>(new f());
        } else if ("text".equals(virtualNode.getMachTag())) {
            aVar2 = new com.sankuai.waimai.mach.node.a<>(new e());
        } else if ("image".equals(virtualNode.getMachTag())) {
            aVar2 = new com.sankuai.waimai.mach.node.a<>(new com.sankuai.waimai.mach.component.c());
        } else if ("richtext".equals(virtualNode.getMachTag())) {
            aVar2 = new com.sankuai.waimai.mach.node.a<>(new com.sankuai.waimai.mach.component.richtext.c());
        } else if ("layout".equals(virtualNode.getMachTag())) {
            aVar2 = new com.sankuai.waimai.mach.node.a<>(new com.sankuai.waimai.mach.component.d());
        } else {
            Mach mach = virtualNode.getMach();
            if (mach == null) {
                throw new IllegalStateException("mach is null");
            }
            String machTag = virtualNode.getMachTag();
            ITagProcessor iTagProcessor = mach.getProcessorMap() != null ? mach.getProcessorMap().get(machTag) : null;
            if (iTagProcessor == null && !TextUtils.isEmpty(machTag)) {
                iTagProcessor = com.sankuai.waimai.mach.common.a.a().b().get(machTag);
            }
            if (iTagProcessor != null) {
                aVar2 = new com.sankuai.waimai.mach.node.a<>(iTagProcessor.createComponent());
            } else {
                throw new com.sankuai.waimai.mach.exception.a("unknown element tag: " + virtualNode.getMachTag(), -1);
            }
        }
        List<VirtualNode> children = virtualNode.getChildren();
        if (children != null && children.size() > 0) {
            for (VirtualNode virtualNode2 : children) {
                if (virtualNode2 != null) {
                    aVar2.a(a(virtualNode2, aVar2));
                }
            }
        }
        aVar2.g = virtualNode;
        aVar2.e = aVar;
        aVar2.i = virtualNode.getNodeUUID();
        aVar2.j = virtualNode.getMachTag();
        aVar2.a(virtualNode.getMach());
        aVar2.onBind(virtualNode.getTemplateNode());
        return aVar2;
    }

    @Override // com.sankuai.waimai.mach.render.c
    public final View a(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26131fdaf1e4dc769822ba518d700b41", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26131fdaf1e4dc769822ba518d700b41") : a(aVar, true);
    }

    @Override // com.sankuai.waimai.mach.render.c
    public final View a(com.sankuai.waimai.mach.node.a aVar, boolean z) {
        List<com.sankuai.waimai.mach.node.a> b;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3367487e1962b4b0502d48c067a7580e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3367487e1962b4b0502d48c067a7580e");
        }
        View b2 = b(aVar, z);
        if (aVar.h.ad_() && (b = aVar.b()) != null && b.size() > 0) {
            for (int i = 0; i < b.size(); i++) {
                a(b.get(i));
            }
        }
        return b2;
    }

    @Override // com.sankuai.waimai.mach.render.c
    public final void a(com.sankuai.waimai.mach.node.a aVar, com.sankuai.waimai.mach.node.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f19bb9440038df8095da52adcfc14a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f19bb9440038df8095da52adcfc14a");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(aVar2);
        a(arrayList, arrayList2);
    }

    private void a(List<com.sankuai.waimai.mach.node.a> list, List<com.sankuai.waimai.mach.node.a> list2) {
        while (true) {
            int i = 0;
            Object[] objArr = {list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f6e046389f2e1f3815f062b1127d5f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f6e046389f2e1f3815f062b1127d5f4");
                return;
            } else if (list.size() <= 0 && list2.size() <= 0) {
                return;
            } else {
                if (list.size() > 0 && list2.size() <= 0) {
                    while (i < list.size()) {
                        c(list.get(i));
                        i++;
                    }
                    return;
                } else if (list.size() <= 0 && list2.size() > 0) {
                    a(list2);
                    return;
                } else {
                    ArrayList arrayList = new ArrayList(list);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        com.sankuai.waimai.mach.node.a aVar = list2.get(i2);
                        com.sankuai.waimai.mach.node.a a2 = aVar.a(arrayList);
                        if (a2 != null && aVar != a2 && !b(a2)) {
                            aVar.a((com.sankuai.waimai.mach.component.base.a) a2.h);
                            aVar.h.a(aVar, true);
                            arrayList.remove(a2);
                            arrayList2.add(aVar);
                        } else {
                            arrayList3.add(aVar);
                        }
                    }
                    if (arrayList3.size() > 0) {
                        a(arrayList3);
                    }
                    if (arrayList.size() > 0) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            c(arrayList.get(i3));
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(list);
                    arrayList4.removeAll(arrayList);
                    list = new ArrayList<>();
                    ArrayList arrayList5 = new ArrayList();
                    for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                        list.addAll(((com.sankuai.waimai.mach.node.a) arrayList4.get(i4)).b());
                    }
                    while (i < arrayList2.size()) {
                        arrayList5.addAll(((com.sankuai.waimai.mach.node.a) arrayList2.get(i)).b());
                        i++;
                    }
                    list2 = arrayList5;
                }
            }
        }
    }

    private void a(List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd52ac315df4978e0fed4abba7fa9722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd52ac315df4978e0fed4abba7fa9722");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            com.sankuai.waimai.mach.node.a aVar = list.get(i);
            a(aVar);
            d(aVar);
        }
    }

    private View b(com.sankuai.waimai.mach.node.a aVar, boolean z) {
        com.sankuai.waimai.mach.node.a aVar2;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acab2a772c4091c42926a869d5fdad49", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acab2a772c4091c42926a869d5fdad49");
        }
        if (aVar == null || TextUtils.isEmpty(aVar.j)) {
            return null;
        }
        View b = aVar.b(aVar.b);
        if (b != null && z && (aVar2 = aVar.e) != null) {
            View a2 = aVar2.a(aVar.b);
            if (a2 instanceof ViewGroup) {
                ((ViewGroup) a2).addView(b);
            }
        }
        return b;
    }

    private boolean b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5b1c7e767f612cde410b573aef40f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5b1c7e767f612cde410b573aef40f2")).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (BaseJavaModule.METHOD_TYPE_ASYNC.equals(aVar.j)) {
            return true;
        }
        List<Class<? extends com.sankuai.waimai.mach.component.base.a>> a2 = a();
        if (com.sankuai.waimai.mach.utils.e.a(a2)) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            Class<? extends com.sankuai.waimai.mach.component.base.a> cls = a2.get(i);
            if (cls != null && cls.isInstance(aVar.h)) {
                return true;
            }
        }
        return false;
    }

    private void c(com.sankuai.waimai.mach.node.a aVar) {
        ViewGroup viewGroup;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097dfd7b2f919713fbc5d5d0ea79bd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097dfd7b2f919713fbc5d5d0ea79bd99");
            return;
        }
        View view = aVar.h.o;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    private void d(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d09933d4797b373888a027537eaac0fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d09933d4797b373888a027537eaac0fc");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar2 = aVar.e;
        if (aVar2 == null) {
            return;
        }
        View g = aVar.g();
        View g2 = aVar2.g();
        if (g2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) g2;
            if (g.getParent() != viewGroup) {
                if (g.getParent() != null) {
                    ((ViewGroup) g.getParent()).removeView(g);
                }
            } else {
                viewGroup.removeView(g);
            }
            int indexOf = aVar2.b().indexOf(aVar);
            int childCount = viewGroup.getChildCount();
            if (childCount != 0 && indexOf < childCount) {
                viewGroup.addView(g, indexOf);
            } else {
                viewGroup.addView(g);
            }
        }
    }
}
