package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems;

import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.c;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.d;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.e;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.model.section.SectionInfo.BaseSectionInfo;
import com.dianping.shield.dynamic.model.view.HeaderFooterViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class a<T extends SectionInfo.BaseSectionInfo> extends b<T> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87be2be90880095528abe672dfcea50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87be2be90880095528abe672dfcea50");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b87cc980dd0ee01b2c8f106131ebd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b87cc980dd0ee01b2c8f106131ebd3");
            return;
        }
        super.h();
        ((SectionInfo.BaseSectionInfo) getInfo()).setFooterCell(null);
        ((SectionInfo.BaseSectionInfo) getInfo()).setHeaderCell(null);
        ((SectionInfo.BaseSectionInfo) getInfo()).setSectionHeaderView(null);
        ((SectionInfo.BaseSectionInfo) getInfo()).setSectionFooterView(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.section.b) {
                ((SectionInfo.BaseSectionInfo) getInfo()).setFooterCell(((com.dianping.gcmrnmodule.wrapperviews.containers.section.b) bVar).getChildInfo());
            } else if (bVar instanceof c) {
                ((SectionInfo.BaseSectionInfo) getInfo()).setHeaderCell(((c) bVar).getChildInfo());
            } else if (bVar instanceof e) {
                SectionInfo.BaseSectionInfo baseSectionInfo = (SectionInfo.BaseSectionInfo) getInfo();
                ViewInfo childInfo = ((e) bVar).getChildInfo();
                if (!(childInfo instanceof HeaderFooterViewInfo)) {
                    childInfo = null;
                }
                baseSectionInfo.setSectionHeaderView((HeaderFooterViewInfo) childInfo);
            } else if (bVar instanceof d) {
                SectionInfo.BaseSectionInfo baseSectionInfo2 = (SectionInfo.BaseSectionInfo) getInfo();
                ViewInfo childInfo2 = ((d) bVar).getChildInfo();
                if (!(childInfo2 instanceof HeaderFooterViewInfo)) {
                    childInfo2 = null;
                }
                baseSectionInfo2.setSectionFooterView((HeaderFooterViewInfo) childInfo2);
            }
        }
    }
}
