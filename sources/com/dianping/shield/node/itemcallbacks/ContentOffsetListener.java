package com.dianping.shield.node.itemcallbacks;

import com.meituan.android.common.statistics.Constants;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ContentOffsetListener {
    void offsetChanged(int i, int i2);
}
