package com.sankuai.shangou.stone.whiteboard;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    Map<String, rx.subjects.e> b;
    BlockingQueue<c> c;
    private boolean d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d19ca283564544cfee27e3d888ab10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d19ca283564544cfee27e3d888ab10");
            return;
        }
        this.d = false;
        this.b = new HashMap();
        this.c = new LinkedBlockingQueue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2689b185c723c78697400a79f2b2e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2689b185c723c78697400a79f2b2e6");
        } else if (!this.d) {
            this.d = true;
            while (true) {
                c poll = this.c.poll();
                if (poll != null) {
                    if (poll.b != null) {
                        a((String) poll.b.first, poll.b.second);
                    } else if (poll.c != null) {
                        for (Pair<String, Object> pair : poll.c) {
                            a((String) pair.first, pair.second);
                        }
                    }
                } else {
                    this.d = false;
                    return;
                }
            }
        }
    }

    private void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07314b42acc23a1673aebb036d645006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07314b42acc23a1673aebb036d645006");
            return;
        }
        if (this.b.get(str) == null) {
            this.b.put(str, rx.subjects.b.g());
        }
        try {
            this.b.get(str).onNext(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
