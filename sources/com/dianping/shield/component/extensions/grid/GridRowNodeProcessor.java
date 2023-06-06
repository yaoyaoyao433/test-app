package com.dianping.shield.component.extensions.grid;

import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.cssgrid.c;
import com.dianping.picassomodule.widget.cssgrid.e;
import com.dianping.picassomodule.widget.cssgrid.g;
import com.dianping.picassomodule.widget.cssgrid.i;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.impl.row.RowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/GridRowNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridRowNodeProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        int i;
        boolean a;
        boolean a2;
        boolean a3;
        boolean a4;
        Iterator it;
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1080dc246d23fd42e93877c62f86824", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1080dc246d23fd42e93877c62f86824")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if ((rowItem instanceof GridRowItem) && (shieldRow instanceof GridShieldRow)) {
            GridShieldRow gridShieldRow = (GridShieldRow) shieldRow;
            GridRowItem gridRowItem = (GridRowItem) rowItem;
            gridShieldRow.gridDrawInfo = gridRowItem.gridDrawInfo;
            if (gridShieldRow.gridDrawInfo == null) {
                gridShieldRow.recommendItemHeight = aq.a(getContext(), gridRowItem.recommendItemHeight);
                if (gridRowItem.rowWidth >= 0) {
                    i = aq.a(getContext(), gridRowItem.rowWidth);
                } else {
                    i = gridRowItem.rowWidth;
                }
                gridShieldRow.rowWidth = i;
                c cVar = new c();
                cVar.e = gridRowItem.colCount;
                if (gridRowItem.rowCount > 0) {
                    cVar.d = gridRowItem.rowCount;
                }
                cVar.b = aq.a(getContext(), gridRowItem.xGap);
                cVar.c = aq.a(getContext(), gridRowItem.yGap);
                cVar.j = aq.a(getContext(), gridRowItem.leftMargin);
                cVar.k = aq.a(getContext(), gridRowItem.rightMargin);
                cVar.h = aq.a(getContext(), gridRowItem.topMargin);
                cVar.i = aq.a(getContext(), gridRowItem.bottomMargin);
                cVar.o = new g(gridRowItem.separatorLineColor, gridRowItem.separatorLineStyle);
                ArrayList<e> arrayList = new ArrayList<>();
                ArrayList<ViewItem> arrayList2 = rowItem.viewItems;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ViewItem viewItem = (ViewItem) it2.next();
                        if (viewItem instanceof GridViewItem) {
                            GridViewItem gridViewItem = (GridViewItem) viewItem;
                            String str = gridViewItem.gridAreaTag;
                            if (str != null) {
                                it = it2;
                                arrayList.add(new e(str, gridViewItem.rowStart, gridViewItem.colStart, gridViewItem.rowSpan, gridViewItem.colSpan, aq.a(getContext(), gridViewItem.leftMargin), aq.a(getContext(), gridViewItem.topMargin), aq.a(getContext(), gridViewItem.topMargin), aq.a(getContext(), gridViewItem.bottomMargin)));
                            } else {
                                it = it2;
                                arrayList.add(new e(gridViewItem.rowStart, gridViewItem.colStart, gridViewItem.rowSpan, gridViewItem.colSpan, aq.a(getContext(), gridViewItem.leftMargin), aq.a(getContext(), gridViewItem.topMargin), aq.a(getContext(), gridViewItem.topMargin), aq.a(getContext(), gridViewItem.bottomMargin)));
                            }
                        } else {
                            it = it2;
                            arrayList.add(new e());
                        }
                        it2 = it;
                    }
                    r rVar = r.a;
                }
                r rVar2 = r.a;
                cVar.l = arrayList;
                ArrayList<String> arrayList3 = gridRowItem.gridColWidths;
                Object obj = null;
                if (arrayList3 != null) {
                    ArrayList<i> arrayList4 = new ArrayList<>();
                    for (String str2 : arrayList3) {
                        String str3 = str2;
                        a3 = kotlin.text.g.a((CharSequence) str3, (CharSequence) "%", false);
                        if (a3) {
                            i.a aVar = i.a.GRID_TEMPLATE_STYLE_PERCENTAGE;
                            int a5 = kotlin.text.g.a((CharSequence) str3, "%", 0, false, 6, (Object) null);
                            if (str2 != null) {
                                String substring = str2.substring(0, a5);
                                h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                arrayList4.add(new i(aVar, Float.parseFloat(substring)));
                            } else {
                                throw new o("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            a4 = kotlin.text.g.a((CharSequence) str3, (CharSequence) "fr", false);
                            if (a4) {
                                i.a aVar2 = i.a.GRID_TEMPLATE_STYLE_WEIGHT;
                                int a6 = kotlin.text.g.a((CharSequence) str3, "fr", 0, false, 6, (Object) null);
                                if (str2 != null) {
                                    String substring2 = str2.substring(0, a6);
                                    h.a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList4.add(new i(aVar2, Float.parseFloat(substring2)));
                                } else {
                                    throw new o("null cannot be cast to non-null type java.lang.String");
                                }
                            } else {
                                arrayList4.add(new i(i.a.GRID_TEMPLATE_STYLE_PIXEL, Float.parseFloat(str2)));
                            }
                        }
                    }
                    r rVar3 = r.a;
                    cVar.m = arrayList4;
                    r rVar4 = r.a;
                }
                ArrayList<String> arrayList5 = gridRowItem.gridRowHeight;
                if (arrayList5 != null) {
                    ArrayList<i> arrayList6 = new ArrayList<>();
                    for (String str4 : arrayList5) {
                        String str5 = str4;
                        a = kotlin.text.g.a((CharSequence) str5, (CharSequence) "%", false);
                        if (a) {
                            i.a aVar3 = i.a.GRID_TEMPLATE_STYLE_PERCENTAGE;
                            int a7 = kotlin.text.g.a((CharSequence) str5, "%", 0, false, 6, (Object) null);
                            if (str4 != null) {
                                String substring3 = str4.substring(0, a7);
                                h.a((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                arrayList6.add(new i(aVar3, Float.parseFloat(substring3)));
                            } else {
                                throw new o("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            a2 = kotlin.text.g.a((CharSequence) str5, (CharSequence) "fr", false);
                            if (a2) {
                                i.a aVar4 = i.a.GRID_TEMPLATE_STYLE_WEIGHT;
                                int a8 = kotlin.text.g.a((CharSequence) str5, "fr", 0, false, 6, (Object) null);
                                if (str4 != null) {
                                    String substring4 = str4.substring(0, a8);
                                    h.a((Object) substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList6.add(new i(aVar4, Float.parseFloat(substring4)));
                                } else {
                                    throw new o("null cannot be cast to non-null type java.lang.String");
                                }
                            } else {
                                arrayList6.add(new i(i.a.GRID_TEMPLATE_STYLE_PIXEL, Float.parseFloat(str4)));
                            }
                            obj = null;
                        }
                    }
                    r rVar5 = r.a;
                    cVar.n = arrayList6;
                    r rVar6 = r.a;
                }
                String[][] strArr = gridRowItem.gridAreas;
                if (strArr != null) {
                    cVar.p = strArr;
                    r rVar7 = r.a;
                }
                r rVar8 = r.a;
                gridShieldRow.gridDescription = cVar;
            }
            gridShieldRow.setViewItems(rowItem.viewItems);
            gridShieldRow.setDNodeData(new CommonContainerNodeData((CommonContainerRow) shieldRow));
            CommonContainerNodeData dNodeData = gridShieldRow.getDNodeData();
            if (dNodeData != null) {
                dNodeData.setBackgroundColor(gridRowItem.getBackgroundColor());
            }
            if (gridShieldRow.rowPaintingCallback == null) {
                gridShieldRow.rowPaintingCallback = new DefaultGridRowViewPaintingCallback();
            }
            r rVar9 = r.a;
            return false;
        }
        return false;
    }
}
