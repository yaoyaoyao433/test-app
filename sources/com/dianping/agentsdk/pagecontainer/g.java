package com.dianping.agentsdk.pagecontainer;

import android.view.View;
import com.dianping.shield.feature.ExtraCellTopInterface;
import com.dianping.shield.feature.SetTopInterface;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface g {
    boolean needMultiStickTop();

    View setMultiTopView(ExtraCellTopInterface extraCellTopInterface, int i, View view, i iVar);

    View setMultiTopView(SetTopInterface setTopInterface, int i, View view, i iVar);
}
