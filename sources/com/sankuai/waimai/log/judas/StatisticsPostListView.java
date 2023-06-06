package com.sankuai.waimai.log.judas;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StatisticsPostListView extends StatisticsListView {
    public static ChangeQuickRedirect d;

    public StatisticsPostListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745302a27465053186f68222241c6074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745302a27465053186f68222241c6074");
        }
    }

    public StatisticsPostListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63247fecfa0c046fc5ebd16e9febad16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63247fecfa0c046fc5ebd16e9febad16");
        }
    }

    @Override // com.sankuai.waimai.log.judas.StatisticsListView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3087ef013615b87f755eb1e0cb427cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3087ef013615b87f755eb1e0cb427cb4");
        } else {
            post(new Runnable() { // from class: com.sankuai.waimai.log.judas.StatisticsPostListView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc7c66a96a7703dd66ce50c48a54d140", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc7c66a96a7703dd66ce50c48a54d140");
                    } else {
                        StatisticsPostListView.super.a();
                    }
                }
            });
        }
    }
}
