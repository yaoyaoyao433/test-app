package com.dianping.shield.dynamic.items.paintingcallback;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.FixedMarginViewInfo;
import com.dianping.shield.dynamic.model.view.GridItemInfo;
import com.dianping.shield.dynamic.model.view.GridItemViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleMargin;
import com.dianping.shield.dynamic.objects.DynamicModuleView;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cJ\u001a\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020,H\u0002J\u0018\u00100\u001a\u00020.2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001cJ\u001a\u00101\u001a\u00020.2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u00020.H\u0002R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018¨\u00065"}, d2 = {"Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicWrapperView;", "Landroid/widget/LinearLayout;", "Lcom/dianping/shield/dynamic/protocols/DynamicModuleMarginInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "dynamicModuleView", "Lcom/dianping/shield/dynamic/objects/DynamicModuleView;", "dynamicModuleViewItemData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", DMKeys.KEY_MARGIN_INFO, "getMarginInfo", "setMarginInfo", "dynamicInnerView", "Landroid/view/View;", "hostContainer", "", "viewItemData", "dynamicView", "getAutoLeftMargin", "", "getAutoRightMargin", "getViewMarginInfo", "Lcom/dianping/shield/dynamic/objects/DynamicModuleMargin;", "handleGravityMargin", "", "viewMarginInfo", "paintInput", "setMarginByViewInfo", DMKeys.KEY_VIEW_INFO, "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "updateByData", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class DynamicWrapperView extends LinearLayout implements DynamicModuleMarginInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private MarginInfo contentMarginInfo;
    private DynamicModuleView dynamicModuleView;
    private DynamicModuleViewItemData dynamicModuleViewItemData;
    private DynamicChassisInterface hostChassis;
    @Nullable
    private MarginInfo marginInfo;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicWrapperView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        h.b(context, "context");
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d74d85bf0a4483eb707a78a86f3e78a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d74d85bf0a4483eb707a78a86f3e78a4");
            return;
        }
        this.autoMargin = Boolean.FALSE;
        setGravity(51);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getBottomContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9124e34c23952cacc16f34a1f7bd131", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9124e34c23952cacc16f34a1f7bd131")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getBottomMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25bf3f0d369be8aec0e208d6683b4b29", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25bf3f0d369be8aec0e208d6683b4b29")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getHorizontalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3442caf8a7ed987ac181d9192d1bc62a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3442caf8a7ed987ac181d9192d1bc62a")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getHorizontalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f3b8dc19d7473854c87bd82846bd746", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f3b8dc19d7473854c87bd82846bd746")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getLeftContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "829a8e6ac85b09b4de96dc38e04bbd30", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "829a8e6ac85b09b4de96dc38e04bbd30")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "496b730f482d8105dd48bcafff58ccd4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "496b730f482d8105dd48bcafff58ccd4")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getRightContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b93ac08b0ac2ef4945be502106593b7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b93ac08b0ac2ef4945be502106593b7")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97727970f8fb52827d21e3406e3269f9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97727970f8fb52827d21e3406e3269f9")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getTopContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8b941d090b9e330757fce6b5959615e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8b941d090b9e330757fce6b5959615e")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getTopMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b4ff731a067ddc1826e5d7c4f3b6778", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b4ff731a067ddc1826e5d7c4f3b6778")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getVerticalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00c79b3e316dd98c3228aef8c18f131f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00c79b3e316dd98c3228aef8c18f131f")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getVerticalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01094154878f50e623744e102c65d7d8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01094154878f50e623744e102c65d7d8")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public Boolean getAutoMargin() {
        return this.autoMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public MarginInfo getContentMarginInfo() {
        return this.contentMarginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setContentMarginInfo(@Nullable MarginInfo marginInfo) {
        this.contentMarginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public Boolean getAutoContentMargin() {
        return this.autoContentMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setAutoContentMargin(@Nullable Boolean bool) {
        this.autoContentMargin = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicWrapperView(@NotNull Context context) {
        this(context, null);
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4751db8c461ccb092cec3603a01337c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4751db8c461ccb092cec3603a01337c3");
        }
    }

    public final void paintInput(@NotNull Object obj, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6a7d63b61981ceb046a4458f2866f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6a7d63b61981ceb046a4458f2866f97");
            return;
        }
        h.b(obj, "hostContainer");
        if (dynamicModuleViewItemData != null) {
            dynamicView(obj, dynamicModuleViewItemData).paintViewData(obj, dynamicModuleViewItemData);
            this.dynamicModuleViewItemData = dynamicModuleViewItemData;
            updateByData();
        }
    }

    private final DynamicModuleView dynamicView(Object obj, DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e717f277ae9b355c46a0a72b8f874ca9", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e717f277ae9b355c46a0a72b8f874ca9");
        }
        DynamicModuleView dynamicModuleView = this.dynamicModuleView;
        if (dynamicModuleView == null) {
            DynamicWrapperView dynamicWrapperView = this;
            DynamicModuleView createViewByModel = DynamicModuleView.createViewByModel(dynamicModuleViewItemData);
            createViewByModel.createView(obj, dynamicWrapperView.getContext(), dynamicModuleViewItemData);
            View moduleView = createViewByModel.getModuleView();
            if (moduleView != null) {
                dynamicWrapperView.addView(moduleView, new LinearLayout.LayoutParams(-2, -2));
            }
            this.dynamicModuleView = createViewByModel;
            h.a((Object) createViewByModel, "run {\n\n            Dynam…s\n            }\n        }");
            return createViewByModel;
        }
        return dynamicModuleView;
    }

    private final void updateByData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "991e821c42b52051f01b3fea86c6b5d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "991e821c42b52051f01b3fea86c6b5d8");
            return;
        }
        DynamicModuleViewItemData dynamicModuleViewItemData = this.dynamicModuleViewItemData;
        if (dynamicModuleViewItemData != null) {
            int i = dynamicModuleViewItemData.selectionStyle;
            if (i == DMConstant.SelectionStyle.NONE.value) {
                setBackground(null);
            } else if (i == DMConstant.SelectionStyle.DEFAULT.value) {
                Context context = getContext();
                h.a((Object) context, "context");
                setBackground(context.getResources().getDrawable(R.drawable.pm_table_view_item));
            }
            if (dynamicModuleViewItemData.backgroundColor != Integer.MAX_VALUE) {
                setBackgroundColor(dynamicModuleViewItemData.backgroundColor);
            }
        }
    }

    @NotNull
    public final View dynamicInnerView(@NotNull Object obj, @NotNull DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70a72106a0b97f1e9e45bee0b4edfc4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70a72106a0b97f1e9e45bee0b4edfc4d");
        }
        h.b(obj, "hostContainer");
        h.b(dynamicModuleViewItemData, "viewItemData");
        View moduleView = dynamicView(obj, dynamicModuleViewItemData).getModuleView();
        h.a((Object) moduleView, "dynamicView(hostContaine… viewItemData).moduleView");
        return moduleView;
    }

    public final void setMarginByViewInfo(@Nullable DynamicChassisInterface dynamicChassisInterface, @Nullable BaseViewInfo baseViewInfo) {
        MarginInfo fixedMarginInfo;
        Object[] objArr = {dynamicChassisInterface, baseViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c75a64a4893827165ef96730c5a4a74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c75a64a4893827165ef96730c5a4a74d");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        if (baseViewInfo != null) {
            if (baseViewInfo instanceof CellInfo.BaseCellInfo) {
                CellInfo.BaseCellInfo baseCellInfo = (CellInfo.BaseCellInfo) baseViewInfo;
                setMarginInfo(baseCellInfo.getMarginInfo());
                setAutoMargin(baseCellInfo.getAutoMargin());
                setPadding(aq.a(getContext(), getLeftMargin()), aq.a(getContext(), getTopMargin()), aq.a(getContext(), getRightMargin()), aq.a(getContext(), getBottomMargin()));
            } else if (baseViewInfo instanceof GridItemViewInfo) {
                GridItemInfo gridItemInfo = ((GridItemViewInfo) baseViewInfo).getGridItemInfo();
                if (gridItemInfo != null) {
                    handleGravityMargin(getViewMarginInfo(gridItemInfo.getMarginInfo()));
                }
            } else if (!(baseViewInfo instanceof FixedMarginViewInfo) || (fixedMarginInfo = ((FixedMarginViewInfo) baseViewInfo).getFixedMarginInfo()) == null) {
            } else {
                handleGravityMargin(getViewMarginInfo(fixedMarginInfo));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleGravityMargin(com.dianping.shield.dynamic.objects.DynamicModuleMargin r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.dynamic.items.paintingcallback.DynamicWrapperView.changeQuickRedirect
            java.lang.String r11 = "3e71472ad25e53fd90a9cc87f2f96e9b"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            r1 = 16
            int r2 = r13.left
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L28
            r0 = 3
            int r2 = r13.left
        L26:
            r4 = 0
            goto L34
        L28:
            int r2 = r13.right
            if (r2 == r3) goto L32
            r0 = 5
            int r2 = r13.right
            r4 = r2
            r2 = 0
            goto L34
        L32:
            r2 = 0
            goto L26
        L34:
            int r5 = r13.top
            if (r5 == r3) goto L3f
            r1 = 48
            int r3 = r13.top
            r9 = r3
        L3d:
            r3 = 0
            goto L47
        L3f:
            int r5 = r13.bottom
            if (r5 == r3) goto L3d
            r1 = 80
            int r3 = r13.bottom
        L47:
            r0 = r0 | r1
            r12.setGravity(r0)
            boolean r13 = r13.hasMargin()
            if (r13 == 0) goto L78
            android.content.Context r13 = r12.getContext()
            float r1 = (float) r2
            int r13 = com.dianping.agentsdk.framework.aq.a(r13, r1)
            android.content.Context r1 = r12.getContext()
            float r2 = (float) r9
            int r1 = com.dianping.agentsdk.framework.aq.a(r1, r2)
            android.content.Context r2 = r12.getContext()
            float r4 = (float) r4
            int r2 = com.dianping.agentsdk.framework.aq.a(r2, r4)
            android.content.Context r4 = r12.getContext()
            float r3 = (float) r3
            int r3 = com.dianping.agentsdk.framework.aq.a(r4, r3)
            r12.setPadding(r13, r1, r2, r3)
        L78:
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r13.<init>(r1, r1)
            r13.gravity = r0
            android.view.ViewGroup$LayoutParams r13 = (android.view.ViewGroup.LayoutParams) r13
            r12.setLayoutParams(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.items.paintingcallback.DynamicWrapperView.handleGravityMargin(com.dianping.shield.dynamic.objects.DynamicModuleMargin):void");
    }

    private final DynamicModuleMargin getViewMarginInfo(MarginInfo marginInfo) {
        Integer bottomMargin;
        Integer topMargin;
        Integer rightMargin;
        Integer leftMargin;
        Object[] objArr = {marginInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8508416d5068b18d5764d3470721f92e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleMargin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8508416d5068b18d5764d3470721f92e");
        }
        DynamicModuleMargin dynamicModuleMargin = new DynamicModuleMargin();
        int i = Integer.MIN_VALUE;
        dynamicModuleMargin.left = (marginInfo == null || (leftMargin = marginInfo.getLeftMargin()) == null) ? Integer.MIN_VALUE : leftMargin.intValue();
        dynamicModuleMargin.right = (marginInfo == null || (rightMargin = marginInfo.getRightMargin()) == null) ? Integer.MIN_VALUE : rightMargin.intValue();
        dynamicModuleMargin.top = (marginInfo == null || (topMargin = marginInfo.getTopMargin()) == null) ? Integer.MIN_VALUE : topMargin.intValue();
        if (marginInfo != null && (bottomMargin = marginInfo.getBottomMargin()) != null) {
            i = bottomMargin.intValue();
        }
        dynamicModuleMargin.bottom = i;
        return dynamicModuleMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getAutoLeftMargin() {
        PageContainerThemePackage containerThemePackage;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a62d5dfe016a51ccbb0a872434bfc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a62d5dfe016a51ccbb0a872434bfc6")).intValue();
        }
        DynamicChassisInterface dynamicChassisInterface = this.hostChassis;
        if (dynamicChassisInterface == null || (containerThemePackage = dynamicChassisInterface.getContainerThemePackage()) == null) {
            return 0;
        }
        return containerThemePackage.getLeftMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getAutoRightMargin() {
        PageContainerThemePackage containerThemePackage;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5bd11e0d010f24f52439c38c2ba9322", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5bd11e0d010f24f52439c38c2ba9322")).intValue();
        }
        DynamicChassisInterface dynamicChassisInterface = this.hostChassis;
        if (dynamicChassisInterface == null || (containerThemePackage = dynamicChassisInterface.getContainerThemePackage()) == null) {
            return 0;
        }
        return containerThemePackage.getRightMargin();
    }
}
