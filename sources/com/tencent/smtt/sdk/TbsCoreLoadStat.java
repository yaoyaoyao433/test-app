package com.tencent.smtt.sdk;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.utils.TbsLog;
import java.util.Arrays;
/* loaded from: classes6.dex */
public class TbsCoreLoadStat {
    private static TbsCoreLoadStat d = null;
    public static volatile int mLoadErrorCode = -1;
    private TbsSequenceQueue a = null;
    private boolean b = false;
    private final int c = 3;

    /* loaded from: classes6.dex */
    public class TbsSequenceQueue {
        private int b;
        private int c;
        private int[] d;
        private int e;
        private int f;

        public TbsSequenceQueue() {
            this.b = 10;
            this.e = 0;
            this.f = 0;
            this.c = this.b;
            this.d = new int[this.c];
        }

        public TbsSequenceQueue(int i, int i2) {
            this.b = 10;
            this.e = 0;
            this.f = 0;
            this.c = i2;
            this.d = new int[this.c];
            this.d[0] = i;
            this.f++;
        }

        public void add(int i) {
            if (this.f > this.c - 1) {
                throw new IndexOutOfBoundsException("sequeue is full");
            }
            int[] iArr = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            iArr[i2] = i;
        }

        public void clear() {
            Arrays.fill(this.d, 0);
            this.e = 0;
            this.f = 0;
        }

        public int element() {
            if (empty()) {
                throw new IndexOutOfBoundsException("sequeue is null");
            }
            return this.d[this.e];
        }

        public boolean empty() {
            return this.f == this.e;
        }

        public int length() {
            return this.f - this.e;
        }

        public int remove() {
            if (empty()) {
                throw new IndexOutOfBoundsException("sequeue is null");
            }
            int i = this.d[this.e];
            int[] iArr = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            iArr[i2] = 0;
            return i;
        }

        public String toString() {
            if (empty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = this.e; i < this.f; i++) {
                sb.append(String.valueOf(this.d[i]) + CommonConstant.Symbol.COMMA);
            }
            int length = sb.length();
            StringBuilder delete = sb.delete(length - 1, length);
            delete.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return delete.toString();
        }
    }

    private TbsCoreLoadStat() {
    }

    public static TbsCoreLoadStat getInstance() {
        if (d == null) {
            d = new TbsCoreLoadStat();
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        a(context, i, null);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        TbsLog.e(TbsListener.tag_load_error, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(Context context, int i, Throwable th) {
        TbsLog.e("TbsCoreLoadStat", "[loadError] errorCode: " + i + ", details:" + String.valueOf(th));
        if (th != null) {
            if (mLoadErrorCode == -1) {
                mLoadErrorCode = i;
                TbsLogReport.getInstance(context).setLoadErrorCode(i, th);
                TbsLog.i("TbsCoreLoadStat", mLoadErrorCode + " report success!");
                return;
            }
            TbsLog.i("TbsCoreLoadStat", mLoadErrorCode + " is reported, others will be saved in local TbsLog!");
        }
    }
}
