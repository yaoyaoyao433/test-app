package com.dianping.picasso.view.list;

import android.view.View;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StickyModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isSticky;
    public int maxOffset = Integer.MAX_VALUE;
    public int offset;
    public int originalOffset;
    public PicassoModel pModel;
    public int pos;
    public int stickyTop;
    public View stickyView;
}
