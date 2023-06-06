package com.dianping.shield.dynamic.diff.extra;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.dynamic.agent.DynamicScrollTabAgent;
import com.dianping.shield.dynamic.agent.DynamicTabAgent;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.HoverState;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/dynamic/diff/extra/HoverInfoDiffProxy;", "", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "processHoverBottomInfo", "Lcom/dianping/shield/node/useritem/BottomInfo;", "hoverInfo", "Lcom/dianping/shield/dynamic/model/extra/HoverInfo;", "dividerStyle", "Lcom/dianping/shield/node/useritem/DividerStyle;", "processHoverTopInfo", "Lcom/dianping/shield/node/useritem/TopInfo;", "hoverStateChangeListener", "Lcom/dianping/shield/node/useritem/TopInfo$OnTopStateChangeListener;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface HoverInfoDiffProxy {
    @NotNull
    DynamicChassisInterface getHostChassis();

    @Nullable
    BottomInfo processHoverBottomInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle);

    @Nullable
    TopInfo processHoverTopInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle, @Nullable TopInfo.OnTopStateChangeListener onTopStateChangeListener);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Nullable
        public static /* synthetic */ TopInfo processHoverTopInfo$default(HoverInfoDiffProxy hoverInfoDiffProxy, HoverInfo hoverInfo, DividerStyle dividerStyle, TopInfo.OnTopStateChangeListener onTopStateChangeListener, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    dividerStyle = null;
                }
                if ((i & 4) != 0) {
                    onTopStateChangeListener = null;
                }
                return hoverInfoDiffProxy.processHoverTopInfo(hoverInfo, dividerStyle, onTopStateChangeListener);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processHoverTopInfo");
        }

        @Nullable
        public static TopInfo processHoverTopInfo(final HoverInfoDiffProxy hoverInfoDiffProxy, @NotNull HoverInfo hoverInfo, @Nullable final DividerStyle dividerStyle, @Nullable final TopInfo.OnTopStateChangeListener onTopStateChangeListener) {
            TopInfo.StartType startType;
            TopInfo.EndType endType;
            Object[] objArr = {hoverInfoDiffProxy, hoverInfo, dividerStyle, onTopStateChangeListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0be300062cb226021b5f3517241cca07", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0be300062cb226021b5f3517241cca07");
            }
            h.b(hoverInfo, "hoverInfo");
            Boolean alwaysHover = hoverInfo.getAlwaysHover();
            final boolean booleanValue = alwaysHover != null ? alwaysHover.booleanValue() : false;
            Boolean autoStopHover = hoverInfo.getAutoStopHover();
            boolean booleanValue2 = autoStopHover != null ? autoStopHover.booleanValue() : false;
            final String onHoverStatusChanged = hoverInfo.getOnHoverStatusChanged();
            Integer zPosition = hoverInfo.getZPosition();
            final int intValue = zPosition != null ? zPosition.intValue() : 0;
            Context hostContext = hoverInfoDiffProxy.getHostChassis().getHostContext();
            Float hoverOffset = hoverInfo.getHoverOffset();
            final int a = aq.a(hostContext, hoverOffset != null ? hoverOffset.floatValue() : 0.0f);
            Boolean autoOffset = hoverInfo.getAutoOffset();
            final boolean booleanValue3 = autoOffset != null ? autoOffset.booleanValue() : false;
            Integer autoStopHoverType = hoverInfo.getAutoStopHoverType();
            int intValue2 = autoStopHoverType != null ? autoStopHoverType.intValue() : 0;
            Boolean showTopLine = hoverInfo.getShowTopLine();
            boolean booleanValue4 = showTopLine != null ? showTopLine.booleanValue() : false;
            Boolean showBottomLine = hoverInfo.getShowBottomLine();
            boolean booleanValue5 = showBottomLine != null ? showBottomLine.booleanValue() : false;
            Boolean isHoverTop = hoverInfo.isHoverTop();
            if (isHoverTop == null || !isHoverTop.booleanValue()) {
                return null;
            }
            TopInfo topInfo = new TopInfo();
            if (booleanValue) {
                startType = TopInfo.StartType.ALWAYS;
            } else {
                startType = TopInfo.StartType.SELF;
            }
            topInfo.startType = startType;
            if (booleanValue2) {
                endType = TopInfo.EndType.valuesCustom()[intValue2 + 1];
            } else {
                endType = TopInfo.EndType.NONE;
            }
            topInfo.endType = endType;
            topInfo.zPosition = intValue;
            topInfo.offset = a;
            topInfo.needAutoOffset = booleanValue3;
            final boolean z = booleanValue2;
            final int i = intValue2;
            final boolean z2 = booleanValue4;
            final boolean z3 = booleanValue5;
            topInfo.onTopStateChangeListener = new TopInfo.OnTopStateChangeListener() { // from class: com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy$processHoverTopInfo$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.useritem.TopInfo.OnTopStateChangeListener
                public final void onTopStageChanged(ShieldViewHolder shieldViewHolder, CellType cellType, int i2, int i3, HoverState hoverState) {
                    Object[] objArr2 = {shieldViewHolder, cellType, Integer.valueOf(i2), Integer.valueOf(i3), hoverState};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "44416a64e4a68e12ff0e5c9c8b0b4d47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "44416a64e4a68e12ff0e5c9c8b0b4d47");
                        return;
                    }
                    String str = onHoverStatusChanged;
                    if (str != null) {
                        String str2 = str;
                        if (str2 == null || g.a((CharSequence) str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("hoverStatus", hoverState.ordinal());
                            } catch (JSONException unused) {
                            }
                            DynamicChassisInterface hostChassis = HoverInfoDiffProxy.this.getHostChassis();
                            if (!(hostChassis instanceof ICommonHost)) {
                                hostChassis = null;
                            }
                            ICommonHost iCommonHost = (ICommonHost) hostChassis;
                            if (iCommonHost != null) {
                                iCommonHost.callMethod(str2.toString(), jSONObject);
                            }
                        }
                    }
                    TopInfo.OnTopStateChangeListener onTopStateChangeListener2 = onTopStateChangeListener;
                    if (onTopStateChangeListener2 != null) {
                        onTopStateChangeListener2.onTopStageChanged(shieldViewHolder, cellType, i2, i3, hoverState);
                    }
                    DynamicChassisInterface hostChassis2 = HoverInfoDiffProxy.this.getHostChassis();
                    if (!(hostChassis2 instanceof DynamicTabAgent)) {
                        hostChassis2 = null;
                    }
                    DynamicTabAgent dynamicTabAgent = (DynamicTabAgent) hostChassis2;
                    if (dynamicTabAgent != null) {
                        dynamicTabAgent.setTopState(hoverState);
                    }
                    DynamicChassisInterface hostChassis3 = HoverInfoDiffProxy.this.getHostChassis();
                    if (!(hostChassis3 instanceof DynamicScrollTabAgent)) {
                        hostChassis3 = null;
                    }
                    DynamicScrollTabAgent dynamicScrollTabAgent = (DynamicScrollTabAgent) hostChassis3;
                    if (dynamicScrollTabAgent != null) {
                        h.a((Object) hoverState, "state");
                        dynamicScrollTabAgent.setTopState(hoverState);
                    }
                }
            };
            Context hostContext2 = hoverInfoDiffProxy.getHostChassis().getHostContext();
            if (hostContext2 != null) {
                if (booleanValue4) {
                    topInfo.topDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                    if (dividerStyle != null) {
                        dividerStyle.styleType = DividerStyle.StyleType.TOP;
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellTopLineOffset = new Rect(0, 0, 0, 0);
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellTopLineDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                    }
                }
                if (booleanValue5) {
                    topInfo.bottomDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                    if (dividerStyle != null) {
                        dividerStyle.styleType = DividerStyle.StyleType.BOTTOM;
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellBottomLineOffset = new Rect(0, 0, 0, 0);
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellBottomLineDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                        return topInfo;
                    }
                    return topInfo;
                }
                return topInfo;
            }
            return topInfo;
        }

        @Nullable
        public static /* synthetic */ BottomInfo processHoverBottomInfo$default(HoverInfoDiffProxy hoverInfoDiffProxy, HoverInfo hoverInfo, DividerStyle dividerStyle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    dividerStyle = null;
                }
                return hoverInfoDiffProxy.processHoverBottomInfo(hoverInfo, dividerStyle);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processHoverBottomInfo");
        }

        @Nullable
        public static BottomInfo processHoverBottomInfo(final HoverInfoDiffProxy hoverInfoDiffProxy, @NotNull HoverInfo hoverInfo, @Nullable final DividerStyle dividerStyle) {
            BottomInfo.StartType startType;
            BottomInfo.EndType endType;
            Object[] objArr = {hoverInfoDiffProxy, hoverInfo, dividerStyle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "23a3f0c72e07b043cc337d282659c609", RobustBitConfig.DEFAULT_VALUE)) {
                return (BottomInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "23a3f0c72e07b043cc337d282659c609");
            }
            h.b(hoverInfo, "hoverInfo");
            Boolean alwaysHover = hoverInfo.getAlwaysHover();
            final boolean booleanValue = alwaysHover != null ? alwaysHover.booleanValue() : false;
            Boolean autoStopHover = hoverInfo.getAutoStopHover();
            boolean booleanValue2 = autoStopHover != null ? autoStopHover.booleanValue() : false;
            final String onHoverStatusChanged = hoverInfo.getOnHoverStatusChanged();
            Integer zPosition = hoverInfo.getZPosition();
            final int intValue = zPosition != null ? zPosition.intValue() : 0;
            Context hostContext = hoverInfoDiffProxy.getHostChassis().getHostContext();
            Float hoverOffset = hoverInfo.getHoverOffset();
            final int a = aq.a(hostContext, hoverOffset != null ? hoverOffset.floatValue() : 0.0f);
            Boolean autoOffset = hoverInfo.getAutoOffset();
            final boolean booleanValue3 = autoOffset != null ? autoOffset.booleanValue() : false;
            Integer autoStopHoverType = hoverInfo.getAutoStopHoverType();
            int intValue2 = autoStopHoverType != null ? autoStopHoverType.intValue() : 0;
            Boolean showTopLine = hoverInfo.getShowTopLine();
            boolean booleanValue4 = showTopLine != null ? showTopLine.booleanValue() : false;
            Boolean showBottomLine = hoverInfo.getShowBottomLine();
            boolean booleanValue5 = showBottomLine != null ? showBottomLine.booleanValue() : false;
            Boolean isHoverTop = hoverInfo.isHoverTop();
            if (isHoverTop == null || isHoverTop.booleanValue()) {
                return null;
            }
            BottomInfo bottomInfo = new BottomInfo();
            if (booleanValue) {
                startType = BottomInfo.StartType.ALWAYS;
            } else {
                startType = BottomInfo.StartType.SELF;
            }
            bottomInfo.startType = startType;
            if (booleanValue2) {
                endType = BottomInfo.EndType.valuesCustom()[intValue2 + 1];
            } else {
                endType = BottomInfo.EndType.NONE;
            }
            bottomInfo.endType = endType;
            bottomInfo.zPosition = intValue;
            bottomInfo.offset = Math.abs(a);
            bottomInfo.needAutoOffset = booleanValue3;
            final boolean z = booleanValue2;
            final int i = intValue2;
            final boolean z2 = booleanValue4;
            final boolean z3 = booleanValue5;
            bottomInfo.onBottomStateChangeListener = new BottomInfo.OnBottomStateChangeListener() { // from class: com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy$processHoverBottomInfo$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.useritem.BottomInfo.OnBottomStateChangeListener
                public final void onBottomStageChanged(ShieldViewHolder shieldViewHolder, CellType cellType, int i2, int i3, HoverState hoverState) {
                    Object[] objArr2 = {shieldViewHolder, cellType, Integer.valueOf(i2), Integer.valueOf(i3), hoverState};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "168ec9ed7e14e6d8ec29a45b704ece43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "168ec9ed7e14e6d8ec29a45b704ece43");
                        return;
                    }
                    String str = onHoverStatusChanged;
                    if (str != null) {
                        String str2 = str;
                        if (str2 == null || g.a((CharSequence) str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("hoverStatus", hoverState.ordinal());
                            } catch (JSONException unused) {
                            }
                            DynamicChassisInterface hostChassis = HoverInfoDiffProxy.this.getHostChassis();
                            ICommonHost iCommonHost = hostChassis instanceof ICommonHost ? hostChassis : null;
                            if (iCommonHost != null) {
                                iCommonHost.callMethod(str2.toString(), jSONObject);
                            }
                        }
                    }
                }
            };
            Context hostContext2 = hoverInfoDiffProxy.getHostChassis().getHostContext();
            if (hostContext2 != null) {
                if (booleanValue4) {
                    bottomInfo.topDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                    if (dividerStyle != null) {
                        dividerStyle.styleType = DividerStyle.StyleType.TOP;
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellTopLineOffset = new Rect(0, 0, 0, 0);
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellTopLineDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                    }
                }
                if (booleanValue5) {
                    bottomInfo.bottomDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                    if (dividerStyle != null) {
                        dividerStyle.styleType = DividerStyle.StyleType.BOTTOM;
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellBottomLineOffset = new Rect(0, 0, 0, 0);
                    }
                    if (dividerStyle != null) {
                        dividerStyle.cellBottomLineDrawable = ContextCompat.getDrawable(hostContext2, R.color.pm_line_gray);
                        return bottomInfo;
                    }
                    return bottomInfo;
                }
                return bottomInfo;
            }
            return bottomInfo;
        }
    }
}
