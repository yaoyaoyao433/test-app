package com.sankuai.xm.monitor.report;

import android.os.Build;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.sankuai.xm.base.util.w;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.monitor.report.db.ReportBean;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements Runnable {
    public static ChangeQuickRedirect a;
    a b;
    boolean c;
    private final long[] d;
    private List<ReportBean> e;
    private int f;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(List<ReportBean> list, boolean z);
    }

    public d(List<ReportBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a018fc164f609a35ff2e53444ebbd02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a018fc164f609a35ff2e53444ebbd02");
            return;
        }
        this.d = new long[]{PayTask.j, PayTask.j, PayTask.j};
        this.f = 0;
        this.c = true;
        this.e = list;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.monitor.report.d.run():void");
    }

    private void a(Writer writer) throws IOException {
        int c;
        Object[] objArr = {writer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14969efd51e05564df62e329b1303754", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14969efd51e05564df62e329b1303754");
            return;
        }
        com.sankuai.xm.monitor.b.c();
        com.sankuai.xm.monitor.a d = com.sankuai.xm.monitor.b.d();
        writer.write("[{");
        a(writer, "category", d.j);
        a(writer, "ai", d.b);
        a(writer, "did", d.f);
        a(writer, "dtk", "");
        a(writer, Constants.Environment.KEY_DM, d.g);
        a(writer, AdvertisementOption.PRIORITY_VALID_TIME, "Android");
        a(writer, "pv", Build.VERSION.RELEASE);
        a(writer, "sv", d.i);
        a(writer, "manuf", d.h);
        a(writer, "av", d.d);
        a(writer, "an", d.e);
        a(writer, "build", d.k);
        a(writer, "env", d.m);
        a(writer, "uid", d.c);
        a(writer, MessageStatisticsEntry.PARAM_CHANNEL, d.l);
        StringBuilder sb = new StringBuilder();
        com.sankuai.xm.monitor.b c2 = com.sankuai.xm.monitor.b.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.monitor.b.a;
        if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "e895b26fcba9175744a6afb8b710b198", 6917529027641081856L)) {
            c = ((Integer) PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "e895b26fcba9175744a6afb8b710b198")).intValue();
        } else {
            c = c2.b != null ? com.sankuai.xm.base.util.net.d.c(c2.b) : -1;
        }
        sb.append(c);
        a(writer, "net", sb.toString());
        com.sankuai.xm.monitor.b c3 = com.sankuai.xm.monitor.b.c();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.monitor.b.a;
        a(writer, Constants.Environment.KEY_APN, PatchProxy.isSupport(objArr3, c3, changeQuickRedirect3, false, "76d2e343492a1107cc01af84f784ac9e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr3, c3, changeQuickRedirect3, false, "76d2e343492a1107cc01af84f784ac9e") : w.e(c3.b));
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write("events\":[");
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ReportBean reportBean = this.e.get(i);
            reportBean.status = 5;
            if (reportBean.value != null) {
                writer.write(reportBean.value);
                if (i != size - 1) {
                    writer.write(CommonConstant.Symbol.COMMA);
                }
            }
        }
        writer.write("]}]");
        writer.close();
    }

    private void a(Writer writer, String str, String str2) throws IOException {
        Object[] objArr = {writer, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79908e7057feed68bae93b0a683a3f18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79908e7057feed68bae93b0a683a3f18");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write(str);
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write(CommonConstant.Symbol.COLON);
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write(str2);
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write(CommonConstant.Symbol.COMMA);
    }

    private void a(Writer writer, String str, long j) throws IOException {
        Object[] objArr = {writer, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfdb77ab3fb50ca1e6d511b71faf5098", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfdb77ab3fb50ca1e6d511b71faf5098");
            return;
        }
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write(str);
        writer.write(CommonConstant.Symbol.DOUBLE_QUOTES);
        writer.write(CommonConstant.Symbol.COLON);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        writer.write(sb.toString());
        writer.write(CommonConstant.Symbol.COMMA);
    }
}
