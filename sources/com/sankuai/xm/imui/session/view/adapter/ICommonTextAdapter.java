package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.ColorInt;
import android.support.annotation.Px;
import android.view.View;
import com.sankuai.xm.imui.session.entity.b;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ICommonTextAdapter extends IMsgAdapter {
    @Px
    int getLineSpacingExtra(b bVar);

    @ColorInt
    int getLinkColor(b bVar);

    @ColorInt
    int getTextColor(b bVar);

    @Px
    int getTextFontSize(b bVar);

    Set<String> getTextLinkSchema();

    boolean hasLinkTextUnderLine(b bVar);

    boolean onTextLinkClick(View view, String str);
}
