package com.hhmedic.android.sdk.base.utils.luban;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Luban implements Handler.Callback {
    private static final String DEFAULT_DISK_CACHE_DIR = "luban_disk_cache";
    private static final int MSG_COMPRESS_ERROR = 2;
    private static final int MSG_COMPRESS_START = 1;
    private static final int MSG_COMPRESS_SUCCESS = 0;
    private static final String TAG = "Luban";
    private final OnCompressListener mCompressListener;
    private final Handler mHandler;
    private final int mLeastCompressSize;
    private final List<String> mPaths;
    private String mTargetDir;

    private Luban(Builder builder) {
        this.mPaths = builder.mPaths;
        this.mTargetDir = builder.mTargetDir;
        this.mCompressListener = builder.mCompressListener;
        this.mLeastCompressSize = builder.mLeastCompressSize;
        this.mHandler = new Handler(Looper.getMainLooper(), this);
    }

    public static Builder with(Context context) {
        return new Builder(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getImageCacheFile(Context context, String str) {
        if (TextUtils.isEmpty(this.mTargetDir)) {
            this.mTargetDir = getImageCacheDir(context).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mTargetDir);
        sb.append("/");
        sb.append(System.currentTimeMillis());
        sb.append((int) (Math.random() * 1000.0d));
        if (TextUtils.isEmpty(str)) {
            str = ".jpg";
        }
        sb.append(str);
        return new File(sb.toString());
    }

    @Nullable
    private File getImageCacheDir(Context context) {
        return getImageCacheDir(context, DEFAULT_DISK_CACHE_DIR);
    }

    @Nullable
    private File getImageCacheDir(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable(TAG, 6)) {
            Log.e(TAG, "default disk cache dir is null");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void launch(final Context context) {
        if (this.mPaths == null || (this.mPaths.size() == 0 && this.mCompressListener != null)) {
            this.mCompressListener.onError(new NullPointerException("image file cannot be null"));
        }
        Iterator<String> it = this.mPaths.iterator();
        while (it.hasNext()) {
            final String next = it.next();
            if (Checker.isImage(next)) {
                b.a(AsyncTask.SERIAL_EXECUTOR, new Runnable() { // from class: com.hhmedic.android.sdk.base.utils.luban.Luban.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Luban.this.mHandler.sendMessage(Luban.this.mHandler.obtainMessage(1));
                            Luban.this.mHandler.sendMessage(Luban.this.mHandler.obtainMessage(0, Checker.isNeedCompress(Luban.this.mLeastCompressSize, next) ? new Engine(next, Luban.this.getImageCacheFile(context, Checker.checkSuffix(next))).compress() : new File(next)));
                        } catch (Exception e) {
                            Luban.this.mHandler.sendMessage(Luban.this.mHandler.obtainMessage(2, e));
                        }
                    }
                });
            } else {
                OnCompressListener onCompressListener = this.mCompressListener;
                onCompressListener.onError(new IllegalArgumentException("can not read the path : " + next));
            }
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public File get(String str, Context context) throws Exception {
        return new Engine(str, getImageCacheFile(context, Checker.checkSuffix(str))).compress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public List<File> get(Context context) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.mPaths.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (Checker.isImage(next)) {
                arrayList.add(new Engine(next, getImageCacheFile(context, Checker.checkSuffix(next))).compress());
            }
            it.remove();
        }
        return arrayList;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.mCompressListener == null) {
            return false;
        }
        switch (message.what) {
            case 0:
                this.mCompressListener.onSuccess((File) message.obj);
                break;
            case 1:
                this.mCompressListener.onStart();
                break;
            case 2:
                this.mCompressListener.onError((Throwable) message.obj);
                break;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final Context context;
        private OnCompressListener mCompressListener;
        private int mLeastCompressSize = 100;
        private final List<String> mPaths = new ArrayList();
        private String mTargetDir;

        public Builder putGear(int i) {
            return this;
        }

        Builder(Context context) {
            this.context = context;
        }

        private Luban build() {
            return new Luban(this);
        }

        public Builder load(File file) {
            this.mPaths.add(file.getAbsolutePath());
            return this;
        }

        public Builder load(String str) {
            this.mPaths.add(str);
            return this;
        }

        public Builder load(List<String> list) {
            this.mPaths.addAll(list);
            return this;
        }

        public Builder setCompressListener(OnCompressListener onCompressListener) {
            this.mCompressListener = onCompressListener;
            return this;
        }

        public Builder setTargetDir(String str) {
            this.mTargetDir = str;
            return this;
        }

        public Builder ignoreBy(int i) {
            this.mLeastCompressSize = i;
            return this;
        }

        public void launch() {
            build().launch(this.context);
        }

        public File get(String str) throws Exception {
            return build().get(str, this.context);
        }

        public List<File> get() throws Exception {
            return build().get(this.context);
        }
    }
}
