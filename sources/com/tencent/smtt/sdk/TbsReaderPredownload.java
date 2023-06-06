package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsReaderView;
import java.util.LinkedList;
/* loaded from: classes6.dex */
public class TbsReaderPredownload {
    public static final int READER_SO_SUCCESS = 2;
    public static final int READER_WAIT_IN_QUEUE = 3;
    static final String[] b = {"docx", "pptx", "xlsx", "pdf", "epub", CommonConstant.File.TXT};
    ReaderPreDownloadCallback i;
    Handler a = null;
    LinkedList<String> c = new LinkedList<>();
    boolean d = false;
    ReaderWizard e = null;
    TbsReaderView.ReaderCallback f = null;
    Object g = null;
    Context h = null;
    String j = "";

    /* loaded from: classes6.dex */
    public interface ReaderPreDownloadCallback {
        public static final int NOTIFY_PLUGIN_FAILED = -1;
        public static final int NOTIFY_PLUGIN_SUCCESS = 0;

        void onEvent(String str, int i, boolean z);
    }

    public TbsReaderPredownload(ReaderPreDownloadCallback readerPreDownloadCallback) {
        this.i = null;
        this.i = readerPreDownloadCallback;
        for (String str : b) {
            this.c.add(str);
        }
        a();
    }

    private void b() {
        b(3);
    }

    void a() {
        this.a = new Handler(Looper.getMainLooper()) { // from class: com.tencent.smtt.sdk.TbsReaderPredownload.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 3 || TbsReaderPredownload.this.c.isEmpty() || TbsReaderPredownload.this.d) {
                    return;
                }
                String removeFirst = TbsReaderPredownload.this.c.removeFirst();
                TbsReaderPredownload.this.j = removeFirst;
                if (TbsReaderPredownload.this.a(removeFirst)) {
                    return;
                }
                TbsReaderPredownload.this.a(-1);
            }
        };
    }

    void a(int i) {
        if (this.i != null) {
            this.i.onEvent(this.j, i, this.c.isEmpty());
        }
    }

    void a(int i, int i2) {
        this.a.sendMessageDelayed(this.a.obtainMessage(i), i2);
    }

    boolean a(String str) {
        if (this.g == null || this.e == null || !ReaderWizard.isSupportExt(str)) {
            return false;
        }
        return this.e.checkPlugin(this.g, this.h, str, true);
    }

    void b(int i) {
        this.a.removeMessages(i);
    }

    boolean c(int i) {
        return this.a.hasMessages(i);
    }

    public boolean init(Context context) {
        if (context == null) {
            return false;
        }
        this.h = context.getApplicationContext();
        boolean a = TbsReaderView.a(context.getApplicationContext());
        this.f = new TbsReaderView.ReaderCallback() { // from class: com.tencent.smtt.sdk.TbsReaderPredownload.1
            @Override // com.tencent.smtt.sdk.TbsReaderView.ReaderCallback
            public void onCallBackAction(Integer num, Object obj, Object obj2) {
                int intValue;
                if (num.intValue() == 5012 && 5014 != (intValue = ((Integer) obj).intValue())) {
                    if (5013 == intValue || intValue == 0) {
                        TbsReaderPredownload.this.a(0);
                    } else {
                        TbsReaderPredownload.this.a(-1);
                    }
                    TbsReaderPredownload.this.j = "";
                    TbsReaderPredownload.this.a(3, 100);
                }
            }
        };
        try {
            if (this.e == null) {
                this.e = new ReaderWizard(this.f);
            }
            if (this.g == null) {
                this.g = this.e.getTbsReader();
            }
            return this.g != null ? this.e.initTbsReader(this.g, context.getApplicationContext()) : a;
        } catch (NullPointerException unused) {
            Log.e("TbsReaderPredownload", "Unexpect null object!");
            return false;
        }
    }

    public void pause() {
        this.d = true;
    }

    public void shutdown() {
        this.i = null;
        this.d = false;
        this.c.clear();
        b();
        if (this.e != null) {
            this.e.destroy(this.g);
            this.g = null;
        }
        this.h = null;
    }

    public void start(String str) {
        this.d = false;
        b(3);
        this.c.add(str);
        a(3, 100);
    }

    public void startAll() {
        this.d = false;
        if (!false && !c(3)) {
            a(3, 100);
        }
    }
}
