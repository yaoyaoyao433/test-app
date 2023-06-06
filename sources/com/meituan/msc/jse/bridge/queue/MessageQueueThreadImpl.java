package com.meituan.msc.jse.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.meituan.msc.jse.bridge.SoftAssertions;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.msc.jse.common.futures.SimpleSettableFuture;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class MessageQueueThreadImpl implements MessageQueueThread {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;
    private MessageQueueThreadPerfStats mPerfStats;

    public MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this(str, looper, queueThreadExceptionHandler, null);
        Object[] objArr = {str, looper, queueThreadExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81aa7c454b8ccb630167d2dac00edef3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81aa7c454b8ccb630167d2dac00edef3");
        }
    }

    public MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        Object[] objArr = {str, looper, queueThreadExceptionHandler, messageQueueThreadPerfStats};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e265db0490242e60463909777e32f2bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e265db0490242e60463909777e32f2bc");
            return;
        }
        this.mIsFinished = false;
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.mPerfStats = messageQueueThreadPerfStats;
        this.mAssertionErrorMessage = "Expected to be called from the '" + getName() + "' thread!";
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public void runOnQueue(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1bf04b5d605ac26a842b4254f881678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1bf04b5d605ac26a842b4254f881678");
            return;
        }
        if (this.mIsFinished) {
            g.e("ReactNative", "Tried to enqueue runnable on already finished thread: '" + getName() + "... dropping Runnable.");
        }
        this.mHandler.post(runnable);
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public void runOnQueueDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa9bf00c6260f266ede30b5c83f500c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa9bf00c6260f266ede30b5c83f500c");
            return;
        }
        if (this.mIsFinished) {
            g.e("ReactNative", "Tried to enqueue runnable on already finished thread: '" + getName() + "... dropping Runnable.");
        }
        this.mHandler.postDelayed(runnable, j);
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        Object[] objArr = {callable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfab4561b884ae27acc51e03c7c3e438", RobustBitConfig.DEFAULT_VALUE)) {
            return (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfab4561b884ae27acc51e03c7c3e438");
        }
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() { // from class: com.meituan.msc.jse.bridge.queue.MessageQueueThreadImpl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a7926e2389dff45e7f14194381d8ed22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a7926e2389dff45e7f14194381d8ed22");
                    return;
                }
                try {
                    simpleSettableFuture.a(callable.call());
                } catch (Exception e) {
                    SimpleSettableFuture simpleSettableFuture2 = simpleSettableFuture;
                    Object[] objArr3 = {e};
                    ChangeQuickRedirect changeQuickRedirect4 = SimpleSettableFuture.a;
                    if (PatchProxy.isSupport(objArr3, simpleSettableFuture2, changeQuickRedirect4, false, "6124c26959762dc311ad5d9011f3ca17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, simpleSettableFuture2, changeQuickRedirect4, false, "6124c26959762dc311ad5d9011f3ca17");
                        return;
                    }
                    simpleSettableFuture2.b();
                    simpleSettableFuture2.c = e;
                    simpleSettableFuture2.b.countDown();
                }
            }
        });
        return simpleSettableFuture;
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public boolean isOnThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85b7cba0d73a4798a58d308b48c40306", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85b7cba0d73a4798a58d308b48c40306")).booleanValue() : this.mLooper.getThread() == Thread.currentThread();
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public void assertIsOnThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "677824180b4e6714b925123506fde14b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "677824180b4e6714b925123506fde14b");
        } else {
            SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
        }
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public void assertIsOnThread(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20beddefa6e2d94cb1f737b389b824fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20beddefa6e2d94cb1f737b389b824fe");
            return;
        }
        boolean isOnThread = isOnThread();
        SoftAssertions.assertCondition(isOnThread, this.mAssertionErrorMessage + StringUtil.SPACE + str);
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public void quitSynchronous() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54e304317eeafecb8a938f370933914e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54e304317eeafecb8a938f370933914e");
            return;
        }
        this.mIsFinished = true;
        if (Looper.getMainLooper() == this.mLooper) {
            return;
        }
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.mName);
            }
        }
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.mPerfStats;
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    @DoNotStrip
    public void resetPerfStats() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4d1a3ee0dd07965b132f6ad4ad42684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4d1a3ee0dd07965b132f6ad4ad42684");
            return;
        }
        assignToPerfStats(this.mPerfStats, -1L, -1L);
        runOnQueue(new Runnable() { // from class: com.meituan.msc.jse.bridge.queue.MessageQueueThreadImpl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6077b9b83aa29c48a4718c4bc03c5f3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6077b9b83aa29c48a4718c4bc03c5f3f");
                    return;
                }
                MessageQueueThreadImpl.assignToPerfStats(MessageQueueThreadImpl.this.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assignToPerfStats(MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j, long j2) {
        Object[] objArr = {messageQueueThreadPerfStats, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1927aad0f18b36cb82fce97a2fdea0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1927aad0f18b36cb82fce97a2fdea0e1");
            return;
        }
        messageQueueThreadPerfStats.wallTime = j;
        messageQueueThreadPerfStats.cpuTime = j2;
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        Object[] objArr = {messageQueueThreadSpec, queueThreadExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9278165d647fdffc6fc872d24b707687", RobustBitConfig.DEFAULT_VALUE)) {
            return (MessageQueueThreadImpl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9278165d647fdffc6fc872d24b707687");
        }
        switch (messageQueueThreadSpec.getThreadType()) {
            case MAIN_UI:
                return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
            case NEW_BACKGROUND:
                return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
            default:
                throw new RuntimeException("Unknown thread type: " + messageQueueThreadSpec.getThreadType());
        }
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        Object[] objArr = {str, queueThreadExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8fe8ce2957e064b6a3e120e9e4c04fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MessageQueueThreadImpl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8fe8ce2957e064b6a3e120e9e4c04fd");
        }
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.jse.bridge.queue.MessageQueueThreadImpl.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "278c029db8e4b323bbc50239926f1bf5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "278c029db8e4b323bbc50239926f1bf5");
                    } else {
                        Process.setThreadPriority(-4);
                    }
                }
            });
        }
        return messageQueueThreadImpl;
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        Object[] objArr = {str, new Long(j), queueThreadExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db75d892346b266e8eac4625b90e32f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MessageQueueThreadImpl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db75d892346b266e8eac4625b90e32f1");
        }
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        Runnable runnable = new Runnable() { // from class: com.meituan.msc.jse.bridge.queue.MessageQueueThreadImpl.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c7c62e205afcf90fd388048e07e53dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c7c62e205afcf90fd388048e07e53dc");
                    return;
                }
                Process.setThreadPriority(-4);
                Looper.prepare();
                MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
                MessageQueueThreadImpl.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
                SimpleSettableFuture.this.a(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
                Looper.loop();
            }
        };
        new Thread(null, runnable, "msc_" + str, j).start();
        Pair pair = (Pair) simpleSettableFuture.a();
        return new MessageQueueThreadImpl(str, (Looper) pair.first, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second);
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    public void removeCallbacksAndMessages(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ef39d955f488a748a0d87581f248fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ef39d955f488a748a0d87581f248fd6");
        } else {
            this.mHandler.removeCallbacksAndMessages(obj);
        }
    }

    @Override // com.meituan.msc.jse.bridge.queue.MessageQueueThread
    public void removeCallbacks(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8455617f76e95d4c3e94551ca9520c6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8455617f76e95d4c3e94551ca9520c6e");
        } else {
            this.mHandler.removeCallbacks(runnable);
        }
    }
}
