package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.a;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemManager;", "T", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "setLinkType", "", Constants.EventType.VIEW, "linkType", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;Ljava/lang/Integer;)V", "setSectionFooterBackgroundColor", DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;Lcom/facebook/react/bridge/Dynamic;)V", "setSectionFooterHeight", "footerHeight", "setSectionHeaderBackgroundColor", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "setSectionHeaderHeight", "headerHeight", "setSeparatorLineInfo", "separatorLineInfo", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;Lcom/facebook/react/bridge/ReadableMap;)V", DMKeys.KEY_SECTION_INDEX_TITLE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;Ljava/lang/String;)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class MRNModuleBaseSectionItemManager<T extends a<?>> extends MRNModuleBaseViewGroupManager<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb497d5d04983b03ba5247e8839823ed", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb497d5d04983b03ba5247e8839823ed") : new MRNModuleBaseWrapperShadowView();
    }

    @ReactProp(name = "sectionHeaderHeight")
    public final void setSectionHeaderHeight(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5721e7fc1327b296b628b13acc6827a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5721e7fc1327b296b628b13acc6827a");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setSectionHeaderHeight(num);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "sectionFooterHeight")
    public final void setSectionFooterHeight(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193142ad4f4c81b0bfbf42772c418587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193142ad4f4c81b0bfbf42772c418587");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setSectionFooterHeight(num);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "linkType")
    public final void setLinkType(@NotNull T t, @Nullable Integer num) {
        Object[] objArr = {t, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abf343c82c6649cbf2760829d73ef94b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abf343c82c6649cbf2760829d73ef94b");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setLinkType(num);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = "separatorLineInfo")
    public final void setSeparatorLineInfo(@NotNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c99dc00aafd689594e86f79e0617ecf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c99dc00aafd689594e86f79e0617ecf9");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setSeparatorLineInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableMap) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR)
    public final void setSectionHeaderBackgroundColor(@NotNull T t, @Nullable Dynamic dynamic) {
        Object[] objArr = {t, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0fa9702cd1dcc30bc5af32ea1505da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0fa9702cd1dcc30bc5af32ea1505da9");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setSectionHeaderBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR)
    public final void setSectionFooterBackgroundColor(@NotNull T t, @Nullable Dynamic dynamic) {
        Object[] objArr = {t, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca4bba20a38fa131e377fecd8cc47084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca4bba20a38fa131e377fecd8cc47084");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setSectionFooterBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        b.a().a(t.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_INDEX_TITLE)
    public final void setSeparatorLineInfo(@NotNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5def6bd9fcb8babb82f7c7c8051a3e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5def6bd9fcb8babb82f7c7c8051a3e7a");
            return;
        }
        h.b(t, Constants.EventType.VIEW);
        ((SectionInfo.BaseSectionInfo) t.getInfo()).setSectionIndexTitle(str);
        b.a().a(t.getHostWrapperView());
    }
}
