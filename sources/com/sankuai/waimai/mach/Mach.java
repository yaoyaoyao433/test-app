package com.sankuai.waimai.mach;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.common.d;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.js.KNBCallback;
import com.sankuai.waimai.mach.jsv8.b;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.mach.render.RenderNodeTask;
import com.sankuai.waimai.mach.render.RenderViewTreeTask;
import com.sankuai.waimai.mach.render.RendererAsyncTask;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Mach extends com.sankuai.waimai.mach.lifecycle.d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context sContext;
    private static Handler sMainHandler = new Handler(Looper.getMainLooper());
    private Map<String, Object> customEnvParams;
    private boolean hasInitJS;
    private Map<String, Map<String, JSInvokeNativeMethod>> invokeNativeMethodMap;
    protected Activity mActivity;
    private String mBiz;
    private com.sankuai.waimai.mach.b mClickHandler;
    private ViewGroup mContainer;
    protected com.sankuai.waimai.mach.common.d mDataProcessor;
    private c mEventListener;
    private com.sankuai.waimai.mach.expose.a mExposeImpl;
    private com.sankuai.waimai.mach.c mImageLoader;
    private KNBCallback mKNBCallback;
    private com.sankuai.waimai.mach.d mLogReport;
    private com.sankuai.waimai.mach.manager.cache.e mMachBundle;
    private String mModuleId;
    private int mNextId;
    private com.sankuai.waimai.mach.component.interf.a mNtpClock;
    private Map<String, ITagProcessor> mProcessorMap;
    private com.sankuai.waimai.mach.f mReRenderListener;
    private View mReadyView;
    private d mReceiveJsEventListener;
    protected com.sankuai.waimai.mach.render.c mRenderEngine;
    private List<g> mRenderListeners;
    private com.sankuai.waimai.mach.node.a mRootNode;
    private com.sankuai.waimai.mach.parser.c mTemplateParser;
    private com.sankuai.waimai.mach.text.c mTextMeasureHelper;
    private j mThemeProvider;
    private com.sankuai.waimai.mach.common.j mUserLoginListener;
    protected com.sankuai.waimai.mach.jsv8.b mV8JSEngine;
    private Set<com.sankuai.waimai.mach.component.interf.b> mViewTreeObservers;
    private com.sankuai.waimai.mach.model.data.a renderRecord;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        @MainThread
        void a(@NonNull String str, @Nullable Map<String, Object> map);
    }

    public static String getVersionName() {
        return "8.3.27";
    }

    public Mach(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf594d961a5c184712a4c3df6442214", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf594d961a5c184712a4c3df6442214");
            return;
        }
        this.mNextId = 0;
        this.mRenderListeners = new CopyOnWriteArrayList();
        this.mViewTreeObservers = new CopyOnWriteArraySet();
        this.hasInitJS = false;
        if (aVar.b == null) {
            sContext = com.sankuai.waimai.mach.common.i.a().c;
        } else {
            sContext = aVar.b.getApplicationContext();
        }
        if (aVar.d == null) {
            aVar.d = new com.sankuai.waimai.mach.d() { // from class: com.sankuai.waimai.mach.Mach.1
                @Override // com.sankuai.waimai.mach.d
                public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar2) {
                }
            };
        }
        if (aVar.e == null) {
            aVar.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.mach.Mach.2
                @Override // com.sankuai.waimai.mach.c
                public final void a(c.a aVar2, k kVar) {
                }
            };
        }
        if (aVar.i != null) {
            this.mProcessorMap = new HashMap(aVar.i);
        } else {
            this.mProcessorMap = new HashMap();
        }
        if (aVar.c == null) {
            this.mRenderEngine = new com.sankuai.waimai.mach.render.b();
        } else {
            this.mRenderEngine = aVar.c;
        }
        this.mTemplateParser = new com.sankuai.waimai.mach.parser.e(new com.sankuai.waimai.mach.parser.a(aVar.f));
        this.mImageLoader = aVar.e;
        this.mLogReport = aVar.d;
        addRenderListener(aVar.f);
        this.mReadyView = aVar.h;
        this.mThemeProvider = aVar.g;
        this.invokeNativeMethodMap = aVar.j;
        this.mKNBCallback = aVar.k;
        this.mV8JSEngine = new com.sankuai.waimai.mach.jsv8.c(this);
        this.mDataProcessor = new com.sankuai.waimai.mach.common.d(this);
        this.mExposeImpl = new com.sankuai.waimai.mach.expose.c(this);
        this.mClickHandler = aVar.l;
        this.mNtpClock = aVar.m;
        this.customEnvParams = aVar.n;
        com.sankuai.waimai.mach.utils.i.a(sContext);
        setRejectedExecutionHandler();
    }

    public static Context getContext() {
        return sContext;
    }

    public Context getCurrentContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2336870629baee0c24f5ba5da1735f21", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2336870629baee0c24f5ba5da1735f21") : this.mActivity != null ? this.mActivity.getBaseContext() : sContext;
    }

    @Nullable
    public Activity getActivity() {
        return this.mActivity;
    }

    public com.sankuai.waimai.mach.parser.c getTemplateParser() {
        return this.mTemplateParser;
    }

    public com.sankuai.waimai.mach.common.d getDataProcessor() {
        return this.mDataProcessor;
    }

    public List<g> getRenderListeners() {
        return this.mRenderListeners;
    }

    public Set<com.sankuai.waimai.mach.component.interf.b> getViewTreeObservers() {
        return this.mViewTreeObservers;
    }

    public Map<String, Map<String, JSInvokeNativeMethod>> getInvokeNativeMethodMap() {
        return this.invokeNativeMethodMap;
    }

    public KNBCallback getKNBCallback() {
        return this.mKNBCallback;
    }

    public com.sankuai.waimai.mach.text.c getTextMeasureHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "303f8fce4c5389625d2bd5f724ed9181", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.text.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "303f8fce4c5389625d2bd5f724ed9181");
        }
        if (this.mTextMeasureHelper == null) {
            this.mTextMeasureHelper = new com.sankuai.waimai.mach.text.c();
        }
        return this.mTextMeasureHelper;
    }

    public void initWithBundle(Activity activity, ViewGroup viewGroup, com.sankuai.waimai.mach.manager.cache.e eVar) {
        Object[] objArr = {activity, viewGroup, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "912cfb3ab9257453db3931f328804186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "912cfb3ab9257453db3931f328804186");
            return;
        }
        this.mContainer = viewGroup;
        this.mActivity = activity;
        registerLifecycleObserver(this);
        reloadBundle(eVar);
    }

    public void initWithBundle(Activity activity, com.sankuai.waimai.mach.manager.cache.e eVar) {
        Object[] objArr = {activity, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f0b0c77366362b2cf3d524710171cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f0b0c77366362b2cf3d524710171cbc");
            return;
        }
        this.mMachBundle = eVar;
        this.mActivity = activity;
        registerLifecycleObserver(this);
    }

    private void resetMachInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b330513adc064e75c9ebf2196048cb25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b330513adc064e75c9ebf2196048cb25");
            return;
        }
        com.sankuai.waimai.mach.common.d dVar = this.mDataProcessor;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.common.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "4deb1a587eaec04c17435d8096ef0096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "4deb1a587eaec04c17435d8096ef0096");
        } else {
            dVar.b.remove(str);
        }
        setRootNode(null);
        if (this.mV8JSEngine != null) {
            this.mV8JSEngine.d();
        }
    }

    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e3c448f0edf55866eb5ad4af675f1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e3c448f0edf55866eb5ad4af675f1be");
            return;
        }
        com.sankuai.waimai.mach.common.d dVar = this.mDataProcessor;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.common.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "f4eafb9810d458d52fb1ea65496fe588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "f4eafb9810d458d52fb1ea65496fe588");
        } else {
            dVar.b.clear();
        }
        setRootNode(null);
        if (this.mV8JSEngine != null) {
            this.mV8JSEngine.e();
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4acc8b62050c537e8a3f15bba776d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4acc8b62050c537e8a3f15bba776d1b");
            return;
        }
        onDestroy();
        this.mActivity = null;
    }

    public void registerLifecycleObserver(@NonNull com.sankuai.waimai.mach.lifecycle.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32f230fd9dc1b82a10d5a99c794bb4d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32f230fd9dc1b82a10d5a99c794bb4d3");
        } else if (getActivity() != null) {
            com.sankuai.waimai.mach.lifecycle.e.a().a(getActivity(), bVar);
        }
    }

    public void unregisterLifecycleObserver(@NonNull com.sankuai.waimai.mach.lifecycle.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "802ea9d25bb021458f0f3366e12526a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "802ea9d25bb021458f0f3366e12526a4");
        } else if (getActivity() != null) {
            com.sankuai.waimai.mach.lifecycle.e.a().b(getActivity(), bVar);
        }
    }

    private void setRejectedExecutionHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad174faf2471ef6e49b0e7caf2479b5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad174faf2471ef6e49b0e7caf2479b5e");
            return;
        }
        if (com.sankuai.waimai.mach.common.g.a instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) com.sankuai.waimai.mach.common.g.a).setRejectedExecutionHandler(new e(this));
        }
        if (com.sankuai.waimai.mach.common.g.b instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) com.sankuai.waimai.mach.common.g.b).setRejectedExecutionHandler(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e implements RejectedExecutionHandler {
        public static ChangeQuickRedirect a;
        private WeakReference<Mach> b;

        public e(Mach mach) {
            Object[] objArr = {mach};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b02c3bfbcc84339522774d416fc719", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b02c3bfbcc84339522774d416fc719");
            } else {
                this.b = new WeakReference<>(mach);
            }
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Object[] objArr = {runnable, threadPoolExecutor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f07d2dfc4a13727c4971bedf497e24", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f07d2dfc4a13727c4971bedf497e24");
                return;
            }
            Mach mach = this.b.get();
            if (mach != null) {
                com.sankuai.waimai.mach.render.d.a(mach, 6, new RuntimeException("线程池已满"));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements RejectedExecutionHandler {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Object[] objArr = {runnable, threadPoolExecutor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98200c7731b27d5bfdf235156a017519", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98200c7731b27d5bfdf235156a017519");
                return;
            }
            com.sankuai.waimai.mach.e e = com.sankuai.waimai.mach.common.i.a().e();
            if (e != null) {
                e.a(DownloadException.UN_KNOWN, "mach/template/download", 0);
                HashMap hashMap = new HashMap();
                hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf((int) DownloadException.UN_KNOWN));
                e.a("mach_template_download", "线程池已满", "线程池已满，模板下载失败", hashMap);
            }
        }
    }

    public void render(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "503da1ca4cb8f89b49af85048a4f1ef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "503da1ca4cb8f89b49af85048a4f1ef5");
        } else {
            render(map, null);
        }
    }

    public void render(Map<String, Object> map, final int i, final int i2, final h hVar) {
        Object[] objArr = {map, Integer.valueOf(i), Integer.valueOf(i2), hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c4d7dd3551a1d6af6a2f74ea6e75b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c4d7dd3551a1d6af6a2f74ea6e75b56");
        } else if (this.mMachBundle == null) {
        } else {
            if (this.mMachBundle.e()) {
                com.sankuai.waimai.launcher.util.aop.b.a(new RendererAsyncTask(this, map, null, i, i2, this.renderRecord, hVar, map) { // from class: com.sankuai.waimai.mach.Mach.3
                    public static ChangeQuickRedirect a;
                    public final /* synthetic */ Map b;

                    {
                        this.b = map;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.waimai.mach.render.RendererAsyncTask, android.os.AsyncTask
                    public final void onPostExecute(com.sankuai.waimai.mach.node.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d59e0a08d459a52c6b83236c8797d85", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d59e0a08d459a52c6b83236c8797d85");
                            return;
                        }
                        super.onPostExecute(aVar);
                        com.sankuai.waimai.mach.render.d.a(Mach.this, Mach.this.getContainer(), aVar, 0);
                        Mach.this.initJSEngineAndCreate(this.b);
                    }
                }, com.sankuai.waimai.mach.common.g.a, new Void[0]);
            } else {
                this.mDataProcessor.a(map, 0, new d.a() { // from class: com.sankuai.waimai.mach.Mach.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.common.d.a
                    @SuppressLint({"StaticFieldLeak"})
                    public final void a(@NonNull Map<String, Object> map2, @Nullable Map<String, Object> map3, com.sankuai.waimai.mach.model.data.a aVar) {
                        Object[] objArr2 = {map2, map3, aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba2ae8280b5710253b38c46c454dc520", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba2ae8280b5710253b38c46c454dc520");
                        } else {
                            com.sankuai.waimai.launcher.util.aop.b.a(new RendererAsyncTask(Mach.this, map2, map3, i, i2, aVar, hVar) { // from class: com.sankuai.waimai.mach.Mach.4.1
                                public static ChangeQuickRedirect a;

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // com.sankuai.waimai.mach.render.RendererAsyncTask, android.os.AsyncTask
                                public final void onPostExecute(com.sankuai.waimai.mach.node.a aVar2) {
                                    Object[] objArr3 = {aVar2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3093d8169189050e5509247c17ab4f45", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3093d8169189050e5509247c17ab4f45");
                                        return;
                                    }
                                    super.onPostExecute(aVar2);
                                    com.sankuai.waimai.mach.render.d.a(Mach.this, Mach.this.getContainer(), aVar2, 0);
                                }
                            }, com.sankuai.waimai.mach.common.g.a, new Void[0]);
                        }
                    }

                    @Override // com.sankuai.waimai.mach.common.d.a
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "712113b651f73ce3bbcb118676c4f95c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "712113b651f73ce3bbcb118676c4f95c");
                        } else {
                            com.sankuai.waimai.mach.render.d.a(Mach.this, 8, exc);
                        }
                    }
                });
            }
        }
    }

    public void render(Map<String, Object> map, h hVar) {
        Object[] objArr = {map, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e54b9d0d8a5c4cb1a40c113fed47ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e54b9d0d8a5c4cb1a40c113fed47ac7");
        } else {
            renderWithType(map, 0, hVar);
        }
    }

    public void renderWithType(Map<String, Object> map, final int i, final h hVar) {
        Object[] objArr = {map, Integer.valueOf(i), hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8539590c1ce670fd787b4134fc2fcc84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8539590c1ce670fd787b4134fc2fcc84");
        } else if (this.mMachBundle != null) {
            if (this.mMachBundle.e()) {
                if (this.mContainer != null) {
                    for (int i2 = 0; i2 < this.mContainer.getChildCount(); i2++) {
                        if (this.mContainer.getChildAt(i2) instanceof f) {
                            this.mContainer.removeViewAt(i2);
                        }
                    }
                    this.mContainer.addView(new f(this, this.mContainer, map, null, this.renderRecord, i, hVar));
                }
                if (hVar != null) {
                    return;
                }
                return;
            }
            this.mDataProcessor.a(map, i, new d.a() { // from class: com.sankuai.waimai.mach.Mach.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.common.d.a
                public final void a(@NonNull Map<String, Object> map2, @Nullable Map<String, Object> map3, com.sankuai.waimai.mach.model.data.a aVar) {
                    Object[] objArr2 = {map2, map3, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d4f1ee0acb5e202709707a092ebf0f68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d4f1ee0acb5e202709707a092ebf0f68");
                    } else if (Mach.this.mContainer != null) {
                        for (int i3 = 0; i3 < Mach.this.mContainer.getChildCount(); i3++) {
                            if (Mach.this.mContainer.getChildAt(i3) instanceof f) {
                                Mach.this.mContainer.removeViewAt(i3);
                            }
                        }
                        Mach.this.mContainer.addView(new f(Mach.this, Mach.this.mContainer, map2, map3, aVar, i, hVar));
                    }
                }

                @Override // com.sankuai.waimai.mach.common.d.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25c80c101029ab2584848ff8b753c192", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25c80c101029ab2584848ff8b753c192");
                    } else {
                        com.sankuai.waimai.mach.render.d.a(Mach.this, 8, exc);
                    }
                }
            });
        }
    }

    public void reRenderNativeUI(Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef710ba5b08bce152bcd047b83b0ca24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef710ba5b08bce152bcd047b83b0ca24");
            return;
        }
        com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(true, getMachBundle().j));
        if (this.mContainer != null) {
            for (int i = 0; i < this.mContainer.getChildCount(); i++) {
                if (this.mContainer.getChildAt(i) instanceof f) {
                    this.mContainer.removeViewAt(i);
                }
            }
            this.mContainer.addView(new f(this, this.mContainer, map, map2, aVar, 1, null));
        }
    }

    private void initBundle(com.sankuai.waimai.mach.manager.cache.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51f7dea79c1a4b195c2d4a09334652df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51f7dea79c1a4b195c2d4a09334652df");
            return;
        }
        this.mMachBundle = eVar;
        this.renderRecord = new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(false, this.mMachBundle.j));
        if (!this.mMachBundle.e() && this.mV8JSEngine != null) {
            this.mV8JSEngine.a(this.mMachBundle, this.mActivity, this.renderRecord);
        }
        if (this.mReadyView != null) {
            this.mContainer.addView(this.mReadyView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initJSEngineAndCreate(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e0f420731067293f5b575fefa1cade8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e0f420731067293f5b575fefa1cade8");
        } else if (this.mMachBundle == null || !this.mMachBundle.e()) {
        } else {
            if (this.mV8JSEngine != null) {
                this.mV8JSEngine.a(this.mMachBundle, this.mActivity, this.renderRecord);
            }
            if (this.hasInitJS) {
                return;
            }
            this.hasInitJS = true;
            this.mDataProcessor.a(map, 0, new d.a() { // from class: com.sankuai.waimai.mach.Mach.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.common.d.a
                @SuppressLint({"StaticFieldLeak"})
                public final void a(@NonNull Map<String, Object> map2, @Nullable Map<String, Object> map3, com.sankuai.waimai.mach.model.data.a aVar) {
                    Object[] objArr2 = {map2, map3, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bcce461935cc9d2506fc992b2ab48696", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bcce461935cc9d2506fc992b2ab48696");
                    } else {
                        Mach.this.mV8JSEngine.a();
                    }
                }

                @Override // com.sankuai.waimai.mach.common.d.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74357c24fb8c197e849e77689f8039fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74357c24fb8c197e849e77689f8039fa");
                    } else {
                        com.sankuai.waimai.mach.render.d.a(Mach.this, 8, exc);
                    }
                }
            }, null);
        }
    }

    public void reloadASTTemplate(String str, ASTTemplate aSTTemplate) {
        Object[] objArr = {str, aSTTemplate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "490d995d1a5bb8f5d7b6c8cf5396190a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "490d995d1a5bb8f5d7b6c8cf5396190a");
            return;
        }
        com.sankuai.waimai.mach.common.d dVar = this.mDataProcessor;
        Object[] objArr2 = {str, aSTTemplate};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.common.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "8ae8c9a560344c6f01e7eb050256a8ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "8ae8c9a560344c6f01e7eb050256a8ae");
        } else if (dVar.b.containsKey(str)) {
            dVar.b.put(str, aSTTemplate);
        }
    }

    public void loadTemplate(String str, ASTTemplate aSTTemplate) {
        Object[] objArr = {str, aSTTemplate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0577ac6fb26fd5a7331318c0935e47a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0577ac6fb26fd5a7331318c0935e47a0");
            return;
        }
        com.sankuai.waimai.mach.common.d dVar = this.mDataProcessor;
        Object[] objArr2 = {str, aSTTemplate};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.common.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "af60a910045ed6742e0b902a79b812a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "af60a910045ed6742e0b902a79b812a0");
        } else {
            dVar.b.put(str, aSTTemplate);
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27d490baa944d17631a1e66aedd8a14f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27d490baa944d17631a1e66aedd8a14f");
            return;
        }
        if (this.mV8JSEngine != null) {
            this.mV8JSEngine.e();
        }
        com.sankuai.waimai.mach.utils.e.b(this.mRootNode);
        com.sankuai.waimai.mach.utils.e.b = null;
        unregisterLifecycleObserver(this);
        unregisterJsEventCallback();
        com.sankuai.waimai.mach.jsv8.jsinterface.timer.d a2 = com.sankuai.waimai.mach.jsv8.jsinterface.timer.d.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.jsv8.jsinterface.timer.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "39fca65fb102d02f3edf6f862ab56d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "39fca65fb102d02f3edf6f862ab56d74");
        } else {
            for (Long l : a2.b.keySet()) {
                com.sankuai.waimai.mach.jsv8.jsinterface.timer.c cVar = a2.b.get(Long.valueOf(l.longValue()));
                if (cVar != null && equals(cVar.c)) {
                    cVar.d();
                }
            }
        }
        if (this.mTextMeasureHelper != null) {
            com.sankuai.waimai.mach.text.c cVar2 = this.mTextMeasureHelper;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.mach.text.c.a;
            if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect4, false, "0b89d8263eb8ad0e6f0cf75826bc9530", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect4, false, "0b89d8263eb8ad0e6f0cf75826bc9530");
                return;
            }
            cVar2.b = null;
            cVar2.c = null;
            cVar2.d = null;
            cVar2.e = null;
        }
    }

    public void bindPreRenderBundle(com.sankuai.waimai.mach.manager.cache.e eVar) {
        this.mMachBundle = eVar;
    }

    public void preRenderTemplate(final com.sankuai.waimai.mach.recycler.c cVar, Handler handler, final b.f fVar, final com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {cVar, handler, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a20e7c6352617930612f8f1395285840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a20e7c6352617930612f8f1395285840");
        } else if (!TextUtils.isEmpty(this.mMachBundle.l)) {
            if (this.mMachBundle.e()) {
                if (!m.d()) {
                    createRenderNode(cVar, cVar.l, null, fVar, aVar);
                    initJSEngineAndCreate(cVar.l);
                    return;
                }
                com.sankuai.waimai.mach.recycler.e.a().a(new Runnable() { // from class: com.sankuai.waimai.mach.Mach.7
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e62aa866c14cf887a51b245d95652188", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e62aa866c14cf887a51b245d95652188");
                            return;
                        }
                        Mach.this.createRenderNode(cVar, cVar.l, null, fVar, aVar);
                        Mach.this.initJSEngineAndCreate(cVar.l);
                    }
                });
                return;
            }
            if (this.mV8JSEngine != null) {
                this.mV8JSEngine.a(this.mMachBundle, this.mActivity, aVar);
            }
            final HashMap hashMap = new HashMap();
            final HashMap hashMap2 = new HashMap();
            this.mDataProcessor.a(cVar.l, 0, new d.a() { // from class: com.sankuai.waimai.mach.Mach.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.common.d.a
                public final void a(@NonNull final Map<String, Object> map, @Nullable final Map<String, Object> map2, com.sankuai.waimai.mach.model.data.a aVar2) {
                    Object[] objArr2 = {map, map2, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2322dc9e0184e6454373078fd0f9e8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2322dc9e0184e6454373078fd0f9e8e");
                    } else if (!m.d()) {
                        if (map != null) {
                            hashMap.putAll(map);
                        }
                        if (map2 != null) {
                            hashMap2.putAll(map2);
                        }
                        Mach.this.createRenderNode(cVar, hashMap, hashMap2, fVar, aVar);
                    } else {
                        com.sankuai.waimai.mach.recycler.e.a().a(new Runnable() { // from class: com.sankuai.waimai.mach.Mach.8.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "dfae07d1a6ff8d11b49c0ab14d4944e9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "dfae07d1a6ff8d11b49c0ab14d4944e9");
                                    return;
                                }
                                if (map != null) {
                                    hashMap.putAll(map);
                                }
                                if (map2 != null) {
                                    hashMap2.putAll(map2);
                                }
                                Mach.this.createRenderNode(cVar, hashMap, hashMap2, fVar, aVar);
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.mach.common.d.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22442ae71de5d08cc69bca2c97539387", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22442ae71de5d08cc69bca2c97539387");
                        return;
                    }
                    com.sankuai.waimai.mach.render.d.a(Mach.this, 8, exc);
                    fVar.a(cVar, new b.C1020b(102));
                    fVar.a();
                }
            }, handler);
        } else {
            createRenderNode(cVar, new HashMap(), new HashMap(), fVar, aVar);
        }
    }

    public void createRenderNode(com.sankuai.waimai.mach.recycler.c cVar, Map<String, Object> map, Map<String, Object> map2, b.f fVar, com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {cVar, map, map2, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b43c5b2fc7f87c7212f5b1f6e3d66f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b43c5b2fc7f87c7212f5b1f6e3d66f69");
            return;
        }
        aVar.a("create_render_node_start");
        RenderNodeTask renderNodeTask = new RenderNodeTask(this, cVar.n, cVar.o, aVar, null);
        if (com.sankuai.waimai.mach.utils.e.a(map)) {
            map.putAll(cVar.l);
        }
        com.sankuai.waimai.mach.node.a createRenderNode = renderNodeTask.createRenderNode(map, map2);
        com.sankuai.waimai.mach.render.d.a(this, createRenderNode);
        setRootNode(createRenderNode);
        cVar.a(createRenderNode);
        if (this.mV8JSEngine != null && this.mMachBundle != null && !this.mMachBundle.e()) {
            this.mV8JSEngine.a();
        }
        if (createRenderNode == null) {
            fVar.a(cVar, new b.C1020b(103));
        }
        fVar.a();
        if (createRenderNode != null) {
            com.sankuai.waimai.mach.manager.a.a().b().renderSuccess(cVar.j, cVar.p, cVar.a(), cVar.i(), cVar.l, (int) (SystemClock.elapsedRealtime() - cVar.k));
        }
        aVar.a("create_render_node_end");
        MonitorManager.RECORD_END(aVar);
        com.sankuai.waimai.mach.log.b.a("MachRender", "render prerender succeed ");
    }

    public void syncPreRenderWithData(Map<String, Object> map, int i, int i2, com.sankuai.waimai.mach.model.data.a aVar, h hVar) {
        Object[] objArr = {map, Integer.valueOf(i), Integer.valueOf(i2), aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f257fb2cc9b1d656a1bc6abe6086a7d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f257fb2cc9b1d656a1bc6abe6086a7d9");
            return;
        }
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(this.mMachBundle.l)) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (!this.mMachBundle.e()) {
                if (this.mV8JSEngine != null) {
                    this.mV8JSEngine.a(this.mMachBundle, this.mActivity, aVar);
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.mDataProcessor.a(map, 0, new d.a() { // from class: com.sankuai.waimai.mach.Mach.9
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.common.d.a
                    public final void a(@NonNull Map<String, Object> map2, @Nullable Map<String, Object> map3, com.sankuai.waimai.mach.model.data.a aVar2) {
                        Object[] objArr2 = {map2, map3, aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c98cfd258fb720576483874e9339d9f1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c98cfd258fb720576483874e9339d9f1");
                            return;
                        }
                        if (map2 != null) {
                            hashMap.putAll(map2);
                        }
                        if (map3 != null) {
                            hashMap2.putAll(map3);
                        }
                        atomicBoolean.set(true);
                        countDownLatch.countDown();
                    }

                    @Override // com.sankuai.waimai.mach.common.d.a
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa8c5e6f00d6216c11eb3a3efbe5e99e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa8c5e6f00d6216c11eb3a3efbe5e99e");
                            return;
                        }
                        atomicBoolean.set(false);
                        com.sankuai.waimai.mach.render.d.a(Mach.this, 8, exc);
                        countDownLatch.countDown();
                    }
                }, null);
                try {
                    countDownLatch.await(MetricsAnrManager.ANR_THRESHOLD, TimeUnit.MILLISECONDS);
                } catch (Exception e2) {
                    com.sankuai.waimai.mach.log.b.a("MachRender", "预渲染失败 | " + e2.getMessage());
                }
                if (!atomicBoolean.get()) {
                    return;
                }
            }
        }
        RenderNodeTask renderNodeTask = new RenderNodeTask(this, i, i2, aVar, hVar);
        if (com.sankuai.waimai.mach.utils.e.a(hashMap)) {
            hashMap.putAll(map);
        }
        com.sankuai.waimai.mach.node.a createRenderNode = renderNodeTask.createRenderNode(hashMap, hashMap2);
        com.sankuai.waimai.mach.render.d.a(this, createRenderNode);
        setRootNode(createRenderNode);
        if (this.mV8JSEngine != null && !this.mMachBundle.e()) {
            this.mV8JSEngine.a();
        }
        com.sankuai.waimai.mach.log.b.a("MachRender", "render prerender succeed ");
        initJSEngineAndCreate(map);
    }

    public void continueRenderWithReuseRenderNodeTree(ViewGroup viewGroup, com.sankuai.waimai.mach.node.a aVar, com.sankuai.waimai.mach.model.data.a aVar2) {
        Object[] objArr = {viewGroup, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63cc20841a66069d50a217c16e3c4103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63cc20841a66069d50a217c16e3c4103");
            return;
        }
        this.mContainer = viewGroup;
        if (this.mContainer.getChildCount() > 0) {
            this.mContainer.removeAllViews();
        }
        View createView = new RenderViewTreeTask(this, aVar2, null).createView(this.mRootNode, aVar);
        if (createView != null) {
            this.mContainer.setClipChildren(false);
            if (com.sankuai.waimai.mach.debug.a.a()) {
                this.mContainer.addView((ViewGroup) com.sankuai.waimai.mach.debug.a.a(createView, getContext(), getMachBundle(), getRootNode()));
            } else {
                this.mContainer.addView(createView);
            }
        }
    }

    public void cleanContainerView() {
        if (this.mContainer != null) {
            this.mContainer = null;
        }
    }

    public com.sankuai.waimai.mach.node.a preRenderNodeTreeSync(Map<String, Object> map, int i, int i2, com.sankuai.waimai.mach.model.data.a aVar, h hVar) {
        Object[] objArr = {map, Integer.valueOf(i), Integer.valueOf(i2), aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da37b373b0eb6684c00499a20013c722", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da37b373b0eb6684c00499a20013c722");
        }
        com.sankuai.waimai.mach.node.a createRenderNode = new RenderNodeTask(this, i, i2, aVar, hVar).createRenderNode(map, null);
        com.sankuai.waimai.mach.render.d.a(this, createRenderNode);
        if (this.mV8JSEngine != null && this.mMachBundle != null && !this.mMachBundle.e()) {
            this.mV8JSEngine.a();
        }
        com.sankuai.waimai.mach.log.b.a("MachRender", "render prerender succeed ");
        return createRenderNode;
    }

    public void attachPreRenderNode(com.sankuai.waimai.mach.node.a aVar, com.sankuai.waimai.mach.node.a aVar2, ViewGroup viewGroup, com.sankuai.waimai.mach.model.data.a aVar3) {
        Object[] objArr = {aVar, aVar2, viewGroup, aVar3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7364acb03f36d61ecd933fd69e80cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7364acb03f36d61ecd933fd69e80cbc");
            return;
        }
        RenderViewTreeTask renderViewTreeTask = new RenderViewTreeTask(this, aVar3, null);
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        View createView = renderViewTreeTask.createView(aVar, aVar2);
        if (createView != null) {
            viewGroup.setClipChildren(false);
            if (com.sankuai.waimai.mach.debug.a.a()) {
                viewGroup.addView((ViewGroup) com.sankuai.waimai.mach.debug.a.a(createView, getContext(), getMachBundle(), getRootNode()));
            } else {
                viewGroup.addView(createView);
            }
        }
    }

    public void syncRenderData(Map<String, Object> map, int i, int i2, com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {map, Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1496f72ae9a1773613b69f7255ad6b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1496f72ae9a1773613b69f7255ad6b3");
            return;
        }
        com.sankuai.waimai.mach.node.a createRenderNode = new RenderNodeTask(this, i, i2, aVar, null).createRenderNode(map, null);
        setRootNode(createRenderNode);
        com.sankuai.waimai.mach.render.d.a(this, createRenderNode);
        if (this.mV8JSEngine != null && this.mMachBundle != null && !this.mMachBundle.e()) {
            this.mV8JSEngine.a("api", map);
            this.mV8JSEngine.a();
        }
        RenderViewTreeTask renderViewTreeTask = new RenderViewTreeTask(this, aVar, null);
        if (this.mContainer.getChildCount() > 0) {
            this.mContainer.removeAllViews();
        }
        View createView = renderViewTreeTask.createView(createRenderNode);
        if (createView != null) {
            this.mContainer.setClipChildren(false);
            if (com.sankuai.waimai.mach.debug.a.a()) {
                this.mContainer.addView((ViewGroup) com.sankuai.waimai.mach.debug.a.a(createView, getContext(), getMachBundle(), getRootNode()));
            } else {
                this.mContainer.addView(createView);
            }
            if (getRootNode() != null) {
                com.sankuai.waimai.mach.utils.j.a(this.mContainer, getRootNode().c, i, i2);
            }
            Iterator<com.sankuai.waimai.mach.component.interf.b> it = getViewTreeObservers().iterator();
            while (it.hasNext()) {
                it.next();
            }
            for (g gVar : getRenderListeners()) {
                gVar.b();
                gVar.a(0);
            }
            initJSEngineAndCreate(map);
        }
    }

    public void setExposeImpl(com.sankuai.waimai.mach.expose.a aVar) {
        this.mExposeImpl = aVar;
    }

    public com.sankuai.waimai.mach.f getReRenderListener() {
        return this.mReRenderListener;
    }

    public void setReRenderListener(com.sankuai.waimai.mach.f fVar) {
        this.mReRenderListener = fVar;
    }

    public void onExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eebfe6fa04d5f72cb0582575fcee61c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eebfe6fa04d5f72cb0582575fcee61c7");
        } else {
            onExpose(this.mRootNode);
        }
    }

    public void onExpose(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e6395a66b801a998004358128846a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e6395a66b801a998004358128846a6");
        } else {
            this.mExposeImpl.a(aVar);
        }
    }

    public List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f471f7a34b50143f551b1c9487c834d1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f471f7a34b50143f551b1c9487c834d1") : this.mExposeImpl.b(this.mRootNode);
    }

    public void triggerViewReport(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c312fddcf99323ff0da3e5c4f36c929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c312fddcf99323ff0da3e5c4f36c929");
        } else {
            this.mExposeImpl.c(aVar);
        }
    }

    public void triggerViewReportExperiment(@NonNull com.sankuai.waimai.mach.node.a aVar, com.sankuai.waimai.mach.d dVar) {
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca0ad3cdf05ac2fadc90d3f5bc29b1a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca0ad3cdf05ac2fadc90d3f5bc29b1a2");
        } else {
            this.mExposeImpl.a(aVar, dVar);
        }
    }

    public Map<String, ITagProcessor> getProcessorMap() {
        return this.mProcessorMap;
    }

    public ViewGroup getContainer() {
        return this.mContainer;
    }

    public void addRenderListener(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72133484e008a317c1e059935fd047b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72133484e008a317c1e059935fd047b");
        } else if (gVar == null || this.mRenderListeners.contains(gVar)) {
        } else {
            this.mRenderListeners.add(gVar);
        }
    }

    public void addViewTreeObserver(com.sankuai.waimai.mach.component.interf.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab849b7598d8c844e35a283877ae758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab849b7598d8c844e35a283877ae758");
        } else {
            this.mViewTreeObservers.add(bVar);
        }
    }

    public void removeViewTreeObserver(com.sankuai.waimai.mach.component.interf.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51fc0c42123b5a31c58dcdc79e7d7f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51fc0c42123b5a31c58dcdc79e7d7f48");
        } else {
            this.mViewTreeObservers.remove(bVar);
        }
    }

    public void removeRenderListener(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3355f0758f03ce9a191cb65a9b730dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3355f0758f03ce9a191cb65a9b730dfb");
        } else {
            this.mRenderListeners.remove(gVar);
        }
    }

    public String getTemplateJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d815420d4340911019b7f87b6888e191", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d815420d4340911019b7f87b6888e191") : this.mMachBundle.k;
    }

    public com.sankuai.waimai.mach.b getClickHandler() {
        return this.mClickHandler;
    }

    public com.sankuai.waimai.mach.component.interf.a getNtpClock() {
        return this.mNtpClock;
    }

    public void setUserLoginListener(com.sankuai.waimai.mach.common.j jVar) {
        this.mUserLoginListener = jVar;
    }

    public com.sankuai.waimai.mach.common.j getUserLoginListener() {
        return this.mUserLoginListener;
    }

    @Nullable
    public ASTTemplate getASTTemplateById(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "178a2b8ca8f406f563e6a9404f47d5fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (ASTTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "178a2b8ca8f406f563e6a9404f47d5fe");
        }
        com.sankuai.waimai.mach.common.d dVar = this.mDataProcessor;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.common.d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "569278e1739f218733caade1a912a3d3", RobustBitConfig.DEFAULT_VALUE) ? (ASTTemplate) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "569278e1739f218733caade1a912a3d3") : dVar.b.get(str);
    }

    public void setRootNode(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74ae2e037f5028af1ca3db1c647d0a39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74ae2e037f5028af1ca3db1c647d0a39");
            return;
        }
        if (aVar == null) {
            com.sankuai.waimai.mach.utils.e.b(this.mRootNode);
        }
        this.mRootNode = aVar;
    }

    public com.sankuai.waimai.mach.node.a getRootNode() {
        return this.mRootNode;
    }

    public com.sankuai.waimai.mach.c getImageLoader() {
        return this.mImageLoader;
    }

    public com.sankuai.waimai.mach.d getLogReport() {
        return this.mLogReport;
    }

    public j getThemeProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3de25f98159d53e11caf0b5ebb264ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3de25f98159d53e11caf0b5ebb264ef");
        }
        if (this.mThemeProvider == null) {
            this.mThemeProvider = new r();
        }
        return this.mThemeProvider;
    }

    public com.sankuai.waimai.mach.render.c getRenderEngine() {
        return this.mRenderEngine;
    }

    public int getNextId() {
        int i = this.mNextId + 1;
        this.mNextId = i;
        return i;
    }

    public static Handler getMainHandler() {
        return sMainHandler;
    }

    public com.sankuai.waimai.mach.jsv8.b getV8JSEngine() {
        return this.mV8JSEngine;
    }

    public c getEventListener() {
        return this.mEventListener;
    }

    public com.sankuai.waimai.mach.manager.cache.e getMachBundle() {
        return this.mMachBundle;
    }

    public String getTemplateId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fcf4cfc38b3a7a3d2f36bf7f2dc249b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fcf4cfc38b3a7a3d2f36bf7f2dc249b");
        }
        if (this.mMachBundle != null) {
            return this.mMachBundle.j;
        }
        return null;
    }

    public Map<String, Object> getCustomEnvParams() {
        return this.customEnvParams;
    }

    public void registerJsEventCallback(d dVar) {
        this.mReceiveJsEventListener = dVar;
    }

    public void unregisterJsEventCallback() {
        this.mReceiveJsEventListener = null;
    }

    public void synchronizeEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15ccb473dd0798b4c35a7e45b2a3b794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15ccb473dd0798b4c35a7e45b2a3b794");
        } else {
            bindDataToJS("env", getEnvParamsMap());
        }
    }

    public void synchronizeEnvironment(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b85da9ca60beff9a685c1e5149732c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b85da9ca60beff9a685c1e5149732c7");
            return;
        }
        Map<String, Object> envParamsMap = getEnvParamsMap();
        if (envParamsMap == null) {
            envParamsMap = new HashMap<>();
        }
        envParamsMap.putAll(map);
        bindDataToJS("env", envParamsMap);
    }

    public Map<String, Object> getEnvParamsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd5f6bef20ca1bb96807e738060cf58", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd5f6bef20ca1bb96807e738060cf58");
        }
        Map<String, Object> b2 = com.sankuai.waimai.mach.common.i.a().b();
        if (com.sankuai.waimai.mach.utils.e.a(b2)) {
            b2 = new HashMap<>();
        }
        Map<String, Object> customEnvParams = getCustomEnvParams();
        if (!com.sankuai.waimai.mach.utils.e.a(customEnvParams)) {
            b2.putAll(customEnvParams);
        }
        return b2;
    }

    public d getReceiveJsEventListener() {
        return this.mReceiveJsEventListener;
    }

    public String getBiz() {
        return this.mBiz;
    }

    public void setBiz(String str) {
        this.mBiz = str;
    }

    public String getModuleId() {
        return this.mModuleId;
    }

    public void setModuleId(String str) {
        this.mModuleId = str;
    }

    public void sendJsEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "040cd1241a6c58f23713ef712b93b290", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "040cd1241a6c58f23713ef712b93b290");
            return;
        }
        if (getEventListener() != null) {
            getEventListener();
        }
        if (this.mV8JSEngine != null) {
            this.mV8JSEngine.b(str, map);
        }
    }

    public void setEventListener(c cVar) {
        this.mEventListener = cVar;
    }

    public void setLogReporter(com.sankuai.waimai.mach.d dVar) {
        if (dVar != null) {
            this.mLogReport = dVar;
        }
    }

    public void asyncCallJSMethod(String str, List<Object> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f2b0afc0432271c825ce40a64b5e6a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f2b0afc0432271c825ce40a64b5e6a7");
        } else {
            asyncCallJSMethod(str, list, null);
        }
    }

    public void asyncCallJSMethod(String str, List<Object> list, b.InterfaceC1011b interfaceC1011b) {
        Object[] objArr = {str, list, interfaceC1011b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afb5ed76e78738b2d91a53e31da355ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afb5ed76e78738b2d91a53e31da355ca");
        } else if (this.mV8JSEngine != null) {
            this.mV8JSEngine.a(str, list, interfaceC1011b);
        }
    }

    public void bindDataToJS(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fd2d1371c187ee5199a3b5cc2c949b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fd2d1371c187ee5199a3b5cc2c949b2");
        } else if (this.mV8JSEngine != null) {
            this.mV8JSEngine.a(str, map);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Context b;
        public com.sankuai.waimai.mach.render.c c;
        public com.sankuai.waimai.mach.d d;
        public com.sankuai.waimai.mach.c e;
        public g f;
        public j g;
        public View h;
        public Map<String, ITagProcessor> i;
        public Map<String, Map<String, JSInvokeNativeMethod>> j;
        public KNBCallback k;
        public com.sankuai.waimai.mach.b l;
        public com.sankuai.waimai.mach.component.interf.a m;
        public Map<String, Object> n;
        private boolean o;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec7ced575a89d71ec135a6540b63f82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec7ced575a89d71ec135a6540b63f82");
            } else {
                this.o = true;
            }
        }

        public final a a(Context context) {
            this.b = context;
            return this;
        }

        public final a a(com.sankuai.waimai.mach.c cVar) {
            this.e = cVar;
            return this;
        }

        public final a a(@NonNull ITagProcessor iTagProcessor) {
            Object[] objArr = {iTagProcessor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b736d25bdd4a7e3e7b56da9d48001faf", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b736d25bdd4a7e3e7b56da9d48001faf");
            }
            if (this.i == null) {
                this.i = new HashMap();
            }
            this.i.put(iTagProcessor.getTagName(), iTagProcessor);
            return this;
        }

        public final a a(JSInvokeNativeMethod jSInvokeNativeMethod) {
            Object[] objArr = {jSInvokeNativeMethod};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5833afa4a165118aece78071f4170dc5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5833afa4a165118aece78071f4170dc5");
            }
            if (jSInvokeNativeMethod == null) {
                return this;
            }
            if (this.j == null) {
                this.j = new HashMap();
            }
            String module = jSInvokeNativeMethod.module();
            String[] methods = jSInvokeNativeMethod.methods();
            HashMap hashMap = new HashMap();
            for (String str : methods) {
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, jSInvokeNativeMethod);
                }
            }
            this.j.put(module, hashMap);
            return this;
        }

        public final Mach a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fb07035a61bdba416245aadd563feb", RobustBitConfig.DEFAULT_VALUE) ? (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fb07035a61bdba416245aadd563feb") : new Mach(this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class f extends FrameLayout {
        public static ChangeQuickRedirect a;
        private final Mach c;
        private final ViewGroup d;
        private Map<String, Object> e;
        private Map<String, Object> f;
        private com.sankuai.waimai.mach.model.data.a g;
        private final h h;
        private AsyncTask i;
        private int j;

        public static /* synthetic */ AsyncTask a(f fVar, AsyncTask asyncTask) {
            fVar.i = null;
            return null;
        }

        public f(Mach mach, ViewGroup viewGroup, Map<String, Object> map, Map<String, Object> map2, com.sankuai.waimai.mach.model.data.a aVar, int i, h hVar) {
            super(viewGroup.getContext());
            Object[] objArr = {Mach.this, mach, viewGroup, map, map2, aVar, Integer.valueOf(i), hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68ec6f0720c6bbab99153465cf8eab0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68ec6f0720c6bbab99153465cf8eab0");
                return;
            }
            this.c = mach;
            this.d = viewGroup;
            this.e = map;
            this.f = map2;
            this.g = aVar;
            this.h = hVar;
            this.j = i;
        }

        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"DrawAllocation"})
        public final void onMeasure(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea72f882ed95cab7b58d25654732cc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea72f882ed95cab7b58d25654732cc0");
                return;
            }
            int a2 = com.sankuai.waimai.mach.utils.j.a(this, i);
            int b = com.sankuai.waimai.mach.utils.j.b(this, i2);
            setMeasuredDimension(a2, b);
            Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66151fd72653309f33d1580c9f59c261", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66151fd72653309f33d1580c9f59c261");
                return;
            }
            if (this.i != null) {
                this.i.cancel(false);
            }
            this.i = com.sankuai.waimai.launcher.util.aop.b.a(new RendererAsyncTask(Mach.this, this.e, this.f, a2, b, this.g, this.h) { // from class: com.sankuai.waimai.mach.Mach.f.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.waimai.mach.render.RendererAsyncTask, android.os.AsyncTask
                public final void onPostExecute(com.sankuai.waimai.mach.node.a aVar) {
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab746884a13c3e2f4c01308daaf1407c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab746884a13c3e2f4c01308daaf1407c");
                        return;
                    }
                    super.onPostExecute(aVar);
                    com.sankuai.waimai.mach.render.d.a(f.this.c, f.this.d, aVar, f.this.j);
                    f.a(f.this, null);
                    if (f.this.j == 0) {
                        Mach.this.initJSEngineAndCreate(f.this.e);
                    }
                }
            }, com.sankuai.waimai.mach.common.g.a, new Void[0]);
        }
    }

    public void onPageAppear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9839ccb0565d31797305087aa88aa1ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9839ccb0565d31797305087aa88aa1ba");
        } else if (this.mV8JSEngine != null) {
            this.mV8JSEngine.b();
        }
    }

    public void onPageDisappear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16e9cbbc480b7990b97b31942e2b35c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16e9cbbc480b7990b97b31942e2b35c3");
        } else if (this.mV8JSEngine != null) {
            this.mV8JSEngine.c();
        }
    }

    public void reloadBundle(com.sankuai.waimai.mach.manager.cache.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45d546a214100edf13e92340e702207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45d546a214100edf13e92340e702207");
            return;
        }
        resetMachInstance(eVar.j);
        initBundle(eVar);
    }
}
