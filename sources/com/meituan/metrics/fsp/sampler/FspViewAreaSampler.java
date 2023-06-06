package com.meituan.metrics.fsp.sampler;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.metrics.fsp.FspBean;
import com.meituan.metrics.fsp.FspConfig;
import com.meituan.metrics.fsp.FspScrollBean;
import com.meituan.metrics.fsp.MetricsFspDetector;
import com.meituan.metrics.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspViewAreaSampler implements FspViewSamplerImpl {
    private static final int WHAT_MSG_DELAY = 1;
    private static final int WHAT_MSG_INIT = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int activityHashCode;
    private FspViewSamplerCallBack callBack;
    private ViewGroup currentContentView;
    private int delayTime;
    private int detectFrequency;
    private volatile FspBean fspBean;
    private FspConfig fspConfig;
    private final Handler handler;
    private volatile boolean isAddOnGlobalLayoutListener;
    private volatile boolean isAddOnPreDrawListener;
    private boolean isFinish;
    private boolean isReachBottom;
    private long lastSampleTime;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private final Set<View> viewGroupSet;
    private final Map<View, FspScrollBean> viewScrollMap;

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public FspBean onActivityCreated(Activity activity, long j) {
        Object[] objArr = {activity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a7983388d95c8ab138869d9d192c4aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (FspBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a7983388d95c8ab138869d9d192c4aa");
        }
        return null;
    }

    public FspViewAreaSampler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c430771563adcf7bcf4410eb61ff18ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c430771563adcf7bcf4410eb61ff18ed");
            return;
        }
        this.isFinish = false;
        this.isReachBottom = false;
        this.isAddOnPreDrawListener = false;
        this.isAddOnGlobalLayoutListener = false;
        this.viewScrollMap = new WeakHashMap();
        this.viewGroupSet = Collections.newSetFromMap(new WeakHashMap());
        this.handler = new Handler(Looper.getMainLooper()) { // from class: com.meituan.metrics.fsp.sampler.FspViewAreaSampler.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dacb4d564fd7b551cae0c0239bbe824e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dacb4d564fd7b551cae0c0239bbe824e");
                    return;
                }
                super.handleMessage(message);
                switch (message.what) {
                    case 1:
                        if (FspViewAreaSampler.this.callBack != null) {
                            FspViewAreaSampler.this.callBack.detectFinish(FspViewAreaSampler.this.activityHashCode, 0);
                            return;
                        }
                        return;
                    case 2:
                        if (message.obj instanceof Activity) {
                            Activity activity = (Activity) message.obj;
                            if (activity.isFinishing()) {
                                return;
                            }
                            FspViewAreaSampler.this.activityHashCode = activity.hashCode();
                            FspViewAreaSampler.this.currentContentView = (ViewGroup) activity.findViewById(16908290);
                            if (FspViewAreaSampler.this.currentContentView == null) {
                                if (FspViewAreaSampler.this.callBack != null) {
                                    FspViewAreaSampler.this.callBack.detectFinish(FspViewAreaSampler.this.activityHashCode, 4);
                                    return;
                                }
                                return;
                            }
                            FspViewAreaSampler.this.isAddOnPreDrawListener = true;
                            FspViewAreaSampler.this.currentContentView.getViewTreeObserver().addOnPreDrawListener(FspViewAreaSampler.this.onPreDrawListener);
                            FspViewAreaSampler.this.isAddOnGlobalLayoutListener = true;
                            FspViewAreaSampler.this.currentContentView.getViewTreeObserver().addOnGlobalLayoutListener(FspViewAreaSampler.this.onGlobalLayoutListener);
                            FspViewAreaSampler.this.handler.sendEmptyMessageDelayed(1, FspViewAreaSampler.this.delayTime);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.meituan.metrics.fsp.sampler.FspViewAreaSampler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e238dca3dae9b9e9c7de0b851693817b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e238dca3dae9b9e9c7de0b851693817b")).booleanValue();
                }
                if (System.currentTimeMillis() - FspViewAreaSampler.this.lastSampleTime < FspViewAreaSampler.this.detectFrequency) {
                    return true;
                }
                FspViewAreaSampler.this.sampleViewTree(false);
                return true;
            }
        };
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.metrics.fsp.sampler.FspViewAreaSampler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d3f3f69f627140e071fe773caab51c89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d3f3f69f627140e071fe773caab51c89");
                } else {
                    FspViewAreaSampler.this.sampleViewTree(FspViewAreaSampler.this.fspBean.isDetectReachBottom());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sampleViewTree(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d704ffc36763238b86fc473461f2af2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d704ffc36763238b86fc473461f2af2e");
            return;
        }
        if (this.fspBean.getContentViewRect() == null || this.fspBean.getContentViewRect().width() == 0 || this.fspBean.getContentViewRect().height() == 0) {
            this.fspBean.setContentViewRect(ViewUtils.getRect(this.currentContentView));
        }
        this.lastSampleTime = System.currentTimeMillis();
        if (this.fspBean.addViewSet(traverseViewTree(this.currentContentView, z), this.lastSampleTime)) {
            this.handler.removeMessages(1);
            this.handler.sendEmptyMessageDelayed(1, this.delayTime);
        }
    }

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public void setFmpConfig(FspConfig fspConfig) {
        this.fspConfig = fspConfig;
    }

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public void setCallBack(FspViewSamplerCallBack fspViewSamplerCallBack) {
        this.callBack = fspViewSamplerCallBack;
    }

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public void onActivityCreated(Activity activity, FspBean fspBean) {
        Object[] objArr = {activity, fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef3f1ed925e5e78882a86c840367d1b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef3f1ed925e5e78882a86c840367d1b9");
        } else {
            init(activity, fspBean);
        }
    }

    private void init(Activity activity, FspBean fspBean) {
        Object[] objArr = {activity, fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a4e7c9f2ed99d433ca140c3605fd64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a4e7c9f2ed99d433ca140c3605fd64");
            return;
        }
        this.fspBean = fspBean;
        this.viewGroupSet.clear();
        this.viewScrollMap.clear();
        this.detectFrequency = this.fspConfig.getDetectFrequency();
        this.delayTime = this.fspConfig.getDetectTime(activity.getClass().getName(), MetricsFspDetector.getInstance().isWifi());
        this.handler.removeCallbacksAndMessages(null);
        Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.obj = activity;
        this.handler.sendMessageDelayed(obtainMessage, this.detectFrequency / 2);
        this.isFinish = false;
    }

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public FspBean onDetectFinish(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50d35694049eb699b035634e1340d0e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (FspBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50d35694049eb699b035634e1340d0e9");
        }
        if (this.isFinish || this.fspBean == null) {
            return null;
        }
        this.isFinish = true;
        this.isReachBottom = false;
        this.handler.removeCallbacksAndMessages(null);
        FspBean fspBean = this.fspBean;
        fspBean.setReason(i);
        fspBean.setCalculateTime(System.currentTimeMillis());
        this.fspBean = null;
        if (this.isAddOnPreDrawListener && this.currentContentView != null) {
            this.currentContentView.getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.isAddOnPreDrawListener = false;
        if (this.isAddOnGlobalLayoutListener && this.currentContentView != null) {
            this.currentContentView.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        this.isAddOnGlobalLayoutListener = false;
        this.currentContentView = null;
        return fspBean;
    }

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public void onDown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b2508d6b5eef12501d1abdb95c50adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b2508d6b5eef12501d1abdb95c50adf");
            return;
        }
        for (View view : this.viewGroupSet) {
            FspScrollBean fspScrollBean = ViewUtils.getFspScrollBean(view);
            if (fspScrollBean != null) {
                this.viewScrollMap.put(view, fspScrollBean);
            }
        }
    }

    @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerImpl
    public boolean onScroll() {
        FspScrollBean fspScrollBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4334c9f298d2fb8e6e3b39db0c854ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4334c9f298d2fb8e6e3b39db0c854ad")).booleanValue();
        }
        for (View view : this.viewGroupSet) {
            if (this.viewScrollMap.containsKey(view) && (fspScrollBean = ViewUtils.getFspScrollBean(view)) != null && !fspScrollBean.equals(this.viewScrollMap.get(view))) {
                return true;
            }
        }
        return false;
    }

    private Map<View, View> traverseViewTree(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27891aeff4dcda7bccf8f0ef2b5eaf55", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27891aeff4dcda7bccf8f0ef2b5eaf55");
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        HashMap hashMap = new HashMap();
        arrayDeque.addLast(new Pair(view, null));
        while (!arrayDeque.isEmpty()) {
            Pair pair = (Pair) arrayDeque.pollFirst();
            View view2 = (View) pair.first;
            View view3 = (View) pair.second;
            if (view2 != null && view2.getVisibility() == 0) {
                hashMap.put(view2, view3);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    this.viewGroupSet.add(viewGroup);
                    if (ViewUtils.isViewScroll(viewGroup)) {
                        view3 = viewGroup;
                    }
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayDeque.addLast(new Pair(viewGroup.getChildAt(i), view3));
                    }
                } else if (!this.isReachBottom && z && ViewUtils.getRect(view2).bottom > this.fspBean.getContentViewRect().bottom) {
                    this.fspBean.setReachBottomTime(this.lastSampleTime);
                    this.isReachBottom = true;
                }
            }
        }
        return hashMap;
    }
}
