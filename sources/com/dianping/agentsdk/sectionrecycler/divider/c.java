package com.dianping.agentsdk.sectionrecycler.divider;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.dianping.shield.layoutmanager.CoveredYInterface;
import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.cellnode.CardConfigInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends RecyclerView.f implements ShieldPreloadInterface {
    public static ChangeQuickRedirect a;
    protected b b;
    public boolean c;
    protected CoveredYInterface d;
    private boolean e;

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
    }

    public c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a1b481b87d3f235b0d8380c6b90bbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a1b481b87d3f235b0d8380c6b90bbb");
            return;
        }
        this.c = true;
        this.e = false;
        this.b = bVar;
    }

    public final void a(CoveredYInterface coveredYInterface) {
        this.d = coveredYInterface;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.agentsdk.sectionrecycler.divider.c$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[CardConfigInfo.CardType.valuesCustom().length];

        static {
            try {
                a[CardConfigInfo.CardType.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CardConfigInfo.CardType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CardConfigInfo.CardType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CardConfigInfo.CardType.SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CardConfigInfo.CardType.MIDDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition;
        int itemCount;
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6e0185cc7cf365fb3e8db2b06477cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6e0185cc7cf365fb3e8db2b06477cd");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.b == null || recyclerView == null) {
            return;
        }
        boolean z = recyclerView instanceof ShieldRecyclerViewInterface;
        if (z) {
            childAdapterPosition = ((ShieldRecyclerViewInterface) recyclerView).getShieldChildAdapterPosition(view);
        } else {
            childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        }
        float headerHeight = this.b.getHeaderHeight(childAdapterPosition);
        if (headerHeight > 0.0f) {
            rect.top = (int) (rect.top + headerHeight);
        }
        float footerHeight = this.b.getFooterHeight(childAdapterPosition);
        if (footerHeight > 0.0f) {
            if (z) {
                itemCount = ((ShieldRecyclerViewInterface) recyclerView).getShieldAdapterItemCount() - 1;
            } else {
                itemCount = recyclerView.getAdapter().getItemCount() - 1;
            }
            if (recyclerView.getChildCount() > 0 && itemCount == childAdapterPosition && !this.c) {
                footerHeight = 0.0f;
            }
            rect.bottom = (int) (rect.bottom + footerHeight);
        }
        Drawable topDivider = this.b.getTopDivider(childAdapterPosition);
        if (topDivider != null && this.b.hasTopDividerVerticalOffset(childAdapterPosition)) {
            rect.top += topDivider.getIntrinsicHeight();
        }
        Drawable bottomDivider = this.b.getBottomDivider(childAdapterPosition);
        if (bottomDivider == null || !this.b.hasBottomDividerVerticalOffset(childAdapterPosition)) {
            return;
        }
        rect.bottom += bottomDivider.getIntrinsicHeight();
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition;
        RecyclerView.g gVar;
        int i;
        View view;
        int i2;
        int i3;
        int i4;
        final ShieldDisplayNode shieldDisplayNode;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView.g gVar2;
        int translationY;
        int translationY2;
        int y;
        int y2;
        RecyclerView recyclerView2 = recyclerView;
        int i10 = 1;
        Object[] objArr = {canvas, recyclerView2, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "832004070d682b642814b6cd57d5f15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "832004070d682b642814b6cd57d5f15d");
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        if (this.b == null || recyclerView2 == null) {
            return;
        }
        int coveredY = this.d != null ? this.d.getCoveredY() : 0;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (i11 < childCount) {
            View childAt = recyclerView2.getChildAt(i11);
            if (recyclerView2 instanceof ShieldRecyclerViewInterface) {
                childAdapterPosition = ((ShieldRecyclerViewInterface) recyclerView2).getShieldChildAdapterPosition(childAt);
            } else {
                childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
            }
            int i13 = childAdapterPosition;
            RecyclerView.g gVar3 = (RecyclerView.g) childAt.getLayoutParams();
            ShieldDisplayNode node = this.b.getNode(i13);
            CardConfigInfo.CardType cardType = CardConfigInfo.CardType.NONE;
            if (node == null || node.cardInfo == null || !node.cardInfo.needDrawCard) {
                gVar = gVar3;
                i = i13;
                view = childAt;
                i2 = i11;
                i3 = childCount;
                i4 = i12;
                shieldDisplayNode = node;
                i5 = 0;
                i6 = 0;
            } else {
                CardConfigInfo.CardType cardType2 = node.cardInfo.type;
                i5 = node.cardInfo.marginLeft;
                int i14 = node.cardInfo.marginRight;
                i2 = i11;
                Object[] objArr2 = new Object[i10];
                objArr2[0] = node;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                i6 = i14;
                gVar = gVar3;
                i = i13;
                view = childAt;
                i3 = childCount;
                i4 = i12;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f776053472af0cf521976833eaee0256", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f776053472af0cf521976833eaee0256");
                    shieldDisplayNode = node;
                } else {
                    shieldDisplayNode = node;
                    if (shieldDisplayNode != null && shieldDisplayNode.viewHolder != null) {
                        View view2 = shieldDisplayNode.viewHolder.itemView;
                        final CardConfigInfo cardConfigInfo = shieldDisplayNode.cardInfo;
                        final int i15 = cardConfigInfo.cornerRadius;
                        final PositionType positionType = shieldDisplayNode.getPositionType();
                        if (Build.VERSION.SDK_INT >= 21) {
                            view2.setOutlineProvider(new ViewOutlineProvider() { // from class: com.dianping.agentsdk.sectionrecycler.divider.c.1
                                public static ChangeQuickRedirect a;

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
                                    if (r5.getPositionType() == com.dianping.shield.node.PositionType.MIDDLE) goto L26;
                                 */
                                @Override // android.view.ViewOutlineProvider
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void getOutline(android.view.View r14, android.graphics.Outline r15) {
                                    /*
                                        Method dump skipped, instructions count: 226
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.sectionrecycler.divider.c.AnonymousClass1.getOutline(android.view.View, android.graphics.Outline):void");
                                }
                            });
                            view2.setClipToOutline(true);
                            cardType = cardType2;
                        }
                    }
                }
                cardType = cardType2;
            }
            if (shieldDisplayNode != null) {
                i9 = shieldDisplayNode.staggeredGridTopMargin != null ? shieldDisplayNode.staggeredGridTopMargin.intValue() : 0;
                if (shieldDisplayNode.staggeredGridBottomMargin != null) {
                    int bottom = (int) (view.getBottom() + view.getTranslationY());
                    int max = Math.max(bottom, i4);
                    i7 = i;
                    if (this.b.getFooterDrawable(i7) != null) {
                        i8 = (max - bottom) + shieldDisplayNode.staggeredGridBottomMargin.intValue();
                        i4 = max;
                    } else {
                        i4 = max;
                    }
                } else {
                    i7 = i;
                }
                i8 = 0;
            } else {
                i7 = i;
                i8 = 0;
                i9 = 0;
            }
            Drawable headerDrawable = this.b.getHeaderDrawable(i7);
            int headerHeight = (int) this.b.getHeaderHeight(i7);
            if (headerDrawable != null && headerHeight > 0) {
                int intrinsicHeight = headerDrawable.getIntrinsicHeight();
                if (intrinsicHeight < 0) {
                    intrinsicHeight = headerHeight;
                }
                int max2 = Math.max(0, headerDrawable.getIntrinsicWidth());
                int y3 = ((int) view.getY()) - i9;
                int min = y3 - Math.min(intrinsicHeight, headerHeight);
                int i16 = max2 > 0 ? max2 + paddingLeft : width;
                int max3 = Math.max(min, coveredY);
                if (max3 <= y3) {
                    headerDrawable.setBounds(new Rect(paddingLeft, max3, i16, y3));
                    headerDrawable.setAlpha((int) (view.getAlpha() * 255.0f));
                    headerDrawable.draw(canvas);
                }
            }
            Drawable footerDrawable = this.b.getFooterDrawable(i7);
            int footerHeight = (int) this.b.getFooterHeight(i7);
            if (footerDrawable != null && footerHeight > 0) {
                int intrinsicHeight2 = footerDrawable.getIntrinsicHeight();
                if (intrinsicHeight2 < 0) {
                    intrinsicHeight2 = footerHeight;
                }
                int bottom2 = ((int) (view.getBottom() + view.getTranslationY())) + i8;
                int min2 = Math.min(footerHeight, intrinsicHeight2) + bottom2;
                int max4 = Math.max(bottom2, coveredY);
                if (max4 <= min2) {
                    footerDrawable.setBounds(new Rect(paddingLeft, max4, width, min2));
                    footerDrawable.setAlpha((int) (view.getAlpha() * 255.0f));
                    footerDrawable.draw(canvas);
                }
            }
            Drawable topDivider = this.b.getTopDivider(i7);
            if (topDivider == null || cardType != CardConfigInfo.CardType.NONE) {
                gVar2 = gVar;
            } else {
                int intrinsicHeight3 = topDivider.getIntrinsicHeight();
                if (intrinsicHeight3 < 0) {
                    intrinsicHeight3 = 1;
                }
                if (this.b.hasTopDividerVerticalOffset(i7)) {
                    gVar2 = gVar;
                    y = (((int) view.getY()) - gVar2.topMargin) - intrinsicHeight3;
                    y2 = ((int) view.getY()) - gVar2.topMargin;
                } else {
                    gVar2 = gVar;
                    y = ((int) view.getY()) - gVar2.topMargin;
                    y2 = (((int) view.getY()) - gVar2.topMargin) + intrinsicHeight3;
                }
                Rect a2 = a(new Rect(paddingLeft, y, width, y2), this.b.topDividerOffset(i7));
                a2.top = Math.max(a2.top, coveredY);
                if (a2.top <= a2.bottom) {
                    topDivider.setBounds(a2);
                    topDivider.setAlpha((int) (view.getAlpha() * 255.0f));
                    topDivider.draw(canvas);
                }
            }
            Drawable bottomDivider = this.b.getBottomDivider(i7);
            if (bottomDivider != null) {
                int intrinsicHeight4 = bottomDivider.getIntrinsicHeight();
                if (intrinsicHeight4 < 0) {
                    intrinsicHeight4 = 1;
                }
                if (this.b.hasBottomDividerVerticalOffset(i7)) {
                    translationY = ((int) view.getTranslationY()) + view.getBottom() + gVar2.bottomMargin;
                    translationY2 = ((int) view.getTranslationY()) + view.getBottom() + gVar2.bottomMargin + intrinsicHeight4;
                } else {
                    translationY = ((((int) view.getTranslationY()) + view.getBottom()) + gVar2.bottomMargin) - intrinsicHeight4;
                    translationY2 = ((int) view.getTranslationY()) + view.getBottom() + gVar2.bottomMargin;
                }
                Rect a3 = a(new Rect(paddingLeft, translationY, width, translationY2), this.b.bottomDividerOffset(i7));
                a3.top = Math.max(a3.top, coveredY);
                if (a3.top <= a3.bottom) {
                    if (cardType == CardConfigInfo.CardType.NONE) {
                        bottomDivider.setBounds(a3);
                        bottomDivider.setAlpha((int) (view.getAlpha() * 255.0f));
                        bottomDivider.draw(canvas);
                    } else if ((shieldDisplayNode != null && shieldDisplayNode.getPositionType() == PositionType.FIRST) || shieldDisplayNode.getPositionType() == PositionType.MIDDLE) {
                        a3.left += i5;
                        a3.right -= i6;
                        bottomDivider.setBounds(a3);
                        bottomDivider.setAlpha((int) (view.getAlpha() * 255.0f));
                        bottomDivider.draw(canvas);
                    }
                }
            }
            i11 = i2 + 1;
            i12 = i4;
            childCount = i3;
            recyclerView2 = recyclerView;
            i10 = 1;
        }
    }

    private Rect a(Rect rect, Rect rect2) {
        Object[] objArr = {rect, rect2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4c8c31a518c972c10c69196b76e1d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4c8c31a518c972c10c69196b76e1d0");
        }
        if (rect2 == null) {
            rect2 = new Rect();
        }
        return new Rect(rect.left + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        this.c = true;
        this.e = false;
        this.d = null;
    }
}
