package com.dianping.shield.dynamic.utils;

import android.content.Context;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.common.ComponentExtensionUtil;
import com.dianping.shield.dynamic.model.vc.CardStyle;
import com.dianping.shield.node.cellnode.CardConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CardUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static CardConfigInfo getCardConfigInfo(Context context, CardStyle cardStyle, int i, boolean z) {
        CardConfigInfo.CardType cardType;
        int i2;
        int i3;
        int i4;
        int i5;
        CardConfigInfo.CardType cardType2;
        Object[] objArr = {context, cardStyle, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d824310e4a63f278cebc7ff527cc9908", RobustBitConfig.DEFAULT_VALUE)) {
            return (CardConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d824310e4a63f278cebc7ff527cc9908");
        }
        if (context == null) {
            return null;
        }
        CardConfigInfo.CardType cardType3 = CardConfigInfo.CardType.NONE;
        if (z) {
            if (i == -1) {
                cardType2 = CardConfigInfo.CardType.AUTO;
            } else {
                switch (i) {
                    case 1:
                        cardType2 = CardConfigInfo.CardType.TOP;
                        break;
                    case 2:
                        cardType2 = CardConfigInfo.CardType.MIDDLE;
                        break;
                    case 3:
                        cardType2 = CardConfigInfo.CardType.BOTTOM;
                        break;
                    case 4:
                        cardType2 = CardConfigInfo.CardType.SINGLE;
                        break;
                    default:
                        cardType2 = CardConfigInfo.CardType.NONE;
                        break;
                }
            }
            cardType3 = cardType2;
            if (cardStyle != null) {
                int a = cardStyle.cornerRadius >= 0 ? aq.a(context, cardStyle.cornerRadius) : 0;
                int parseColor = cardStyle.backgroundColor != null ? ComponentExtensionUtil.Companion.parseColor(cardStyle.backgroundColor) : 0;
                int i6 = cardStyle.marginLeft >= 0 ? cardStyle.marginLeft : 0;
                if (cardStyle.marginRight >= 0) {
                    i2 = a;
                    i3 = parseColor;
                    cardType = cardType3;
                    i4 = i6;
                    i5 = cardStyle.marginRight;
                    return new CardConfigInfo(i2, i3, i4, i5, 0, 0, cardType, z);
                }
                i2 = a;
                i3 = parseColor;
                cardType = cardType3;
                i4 = i6;
                i5 = 0;
                return new CardConfigInfo(i2, i3, i4, i5, 0, 0, cardType, z);
            }
        }
        cardType = cardType3;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        return new CardConfigInfo(i2, i3, i4, i5, 0, 0, cardType, z);
    }
}
