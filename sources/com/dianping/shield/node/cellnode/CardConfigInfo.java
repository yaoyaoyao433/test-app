package com.dianping.shield.node.cellnode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CardConfigInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int backgroundColor;
    public int borderColor;
    public int borderWidth;
    public int cornerRadius;
    public int marginLeft;
    public int marginRight;
    public boolean needDrawCard;
    public CardType type;

    public CardConfigInfo(int i, int i2, int i3, int i4, int i5, int i6, CardType cardType, boolean z) {
        this.cornerRadius = i;
        this.backgroundColor = i2;
        this.marginLeft = i3;
        this.marginRight = i4;
        this.borderWidth = i5;
        this.borderColor = i6;
        this.type = cardType;
        this.needDrawCard = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum CardType {
        NONE,
        AUTO,
        TOP,
        MIDDLE,
        BOTTOM,
        SINGLE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        CardType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd450d7ba646d573581200aa1cf92b7d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd450d7ba646d573581200aa1cf92b7d");
            }
        }

        public static CardType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8903c34f4f861ba2c01c9ff9ab3e2095", RobustBitConfig.DEFAULT_VALUE) ? (CardType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8903c34f4f861ba2c01c9ff9ab3e2095") : (CardType) Enum.valueOf(CardType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CardType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4db5f3cf9a258d68bada7ae136fae78b", RobustBitConfig.DEFAULT_VALUE) ? (CardType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4db5f3cf9a258d68bada7ae136fae78b") : (CardType[]) values().clone();
        }
    }
}
