package com.dianping.shield.component.widgets.secondfloor;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.component.widgets.internal.GCLoadingView;
import com.dianping.voyager.widgets.container.secondfloor.a;
import com.dianping.voyager.widgets.container.secondfloor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class PullTo2FRecyclerView extends PageContainerRecyclerView {
    private static final float OFFSET_RADIO = 1.8f;
    private static final int SCROLL_DURATION = 400;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int exposeModeRefreshHeight;
    private CommonPageContainer.OnJumpListener gcOnJumpListener;
    private boolean isGoingToJump;
    private boolean isHeaderRefresh;
    private boolean isScroll;
    private Handler mHandler;
    private b mHeaderView;
    private float mLastY;
    private Mode mMode;
    private boolean mPullRefreshing;
    private Scroller mScroller;
    private LinearLayoutManager manager;
    private CommonPageContainer.OnRefreshListener onRefreshListener;
    private int originHeaderViewHeight;
    private double pullTo2Scale;
    private int refreshHeight;
    private int unExposeModeRefreshHeight;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum Mode {
        DISABLED(0),
        PULL_DOWN_TO_REFRESH(1),
        PULL_DOWN_TO_2F_EXPOSE(2),
        PULL_DOWN_TO_2F_UNEXPOSE(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mIntValue;

        public static Mode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f96d046c755247c3d52e187552c9e13", RobustBitConfig.DEFAULT_VALUE) ? (Mode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f96d046c755247c3d52e187552c9e13") : (Mode) Enum.valueOf(Mode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5bc9bfbe326eca8eba9818eb1c8d6121", RobustBitConfig.DEFAULT_VALUE) ? (Mode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5bc9bfbe326eca8eba9818eb1c8d6121") : (Mode[]) values().clone();
        }

        Mode(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc5c69e94d6dde5a78637bf232941c75", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc5c69e94d6dde5a78637bf232941c75");
            } else {
                this.mIntValue = i;
            }
        }

        public final boolean canPullDown() {
            return this == PULL_DOWN_TO_REFRESH || this == PULL_DOWN_TO_2F_EXPOSE || this == PULL_DOWN_TO_2F_UNEXPOSE;
        }

        public final boolean is2FMode() {
            return this == PULL_DOWN_TO_2F_EXPOSE || this == PULL_DOWN_TO_2F_UNEXPOSE;
        }

        public final int getIntValue() {
            return this.mIntValue;
        }
    }

    public PullTo2FRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bb1f8d595ce3be38707113f78077b7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bb1f8d595ce3be38707113f78077b7b");
            return;
        }
        this.mMode = Mode.PULL_DOWN_TO_REFRESH;
        this.pullTo2Scale = 0.3d;
        this.mPullRefreshing = false;
        this.mLastY = -1.0f;
        this.isScroll = false;
        this.isHeaderRefresh = false;
        this.exposeModeRefreshHeight = aq.a(getContext(), 20.0f);
        this.unExposeModeRefreshHeight = aq.a(getContext(), 40.0f);
        this.isGoingToJump = false;
        init(context, null);
    }

    public PullTo2FRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a018cf38ed3cddcc28ac2d755dd3f98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a018cf38ed3cddcc28ac2d755dd3f98");
            return;
        }
        this.mMode = Mode.PULL_DOWN_TO_REFRESH;
        this.pullTo2Scale = 0.3d;
        this.mPullRefreshing = false;
        this.mLastY = -1.0f;
        this.isScroll = false;
        this.isHeaderRefresh = false;
        this.exposeModeRefreshHeight = aq.a(getContext(), 20.0f);
        this.unExposeModeRefreshHeight = aq.a(getContext(), 40.0f);
        this.isGoingToJump = false;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2c099e0721f2352e2207b45bea1ffd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2c099e0721f2352e2207b45bea1ffd1");
            return;
        }
        setOverScrollMode(2);
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mHandler = new Handler();
        setHeaderView(null);
    }

    public void setMode(Mode mode) {
        this.mMode = mode;
    }

    public Mode get2FMode() {
        return this.mMode;
    }

    public void setHeaderView(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92aa2ad5fefc9d385793588ed02015eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92aa2ad5fefc9d385793588ed02015eb");
            return;
        }
        if (isPullToRefreshing()) {
            onRefreshCompleteNow();
        }
        if (this.mHeaderView != null) {
            try {
                removeHeaderView(this.mHeaderView);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.mMode.is2FMode()) {
            this.mHeaderView = bVar;
        } else {
            this.mHeaderView = new a(getContext());
        }
        if (this.mMode == Mode.PULL_DOWN_TO_2F_EXPOSE) {
            this.mHeaderView.setInitHeight(this.originHeaderViewHeight);
            this.refreshHeight = this.originHeaderViewHeight + this.exposeModeRefreshHeight;
        } else if (this.mMode == Mode.PULL_DOWN_TO_2F_UNEXPOSE) {
            this.refreshHeight = this.originHeaderViewHeight + this.unExposeModeRefreshHeight;
        } else {
            this.refreshHeight = aq.a(getContext(), 80.0f);
        }
        this.mHeaderView.setRefreshCompleteListener(new GCLoadingView.OnRefreshCompleteListener() { // from class: com.dianping.shield.component.widgets.secondfloor.PullTo2FRecyclerView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.widgets.internal.GCLoadingView.OnRefreshCompleteListener
            public void onRefreshComplete() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b67b3f97c0de6f5ba061396f1fd0a497", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b67b3f97c0de6f5ba061396f1fd0a497");
                } else {
                    PullTo2FRecyclerView.this.onRefreshCompleteNow();
                }
            }
        });
        this.mHeaderView.setRefreshHeight(this.refreshHeight);
        addHeaderView(this.mHeaderView);
    }

    public void setJumpPullScale(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5a6c7fff2d326c11f3204d56ecff1ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5a6c7fff2d326c11f3204d56ecff1ee");
        } else {
            this.pullTo2Scale = d;
        }
    }

    public void resetHeaderView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3f1545aea2514c31ada9d133fe83a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3f1545aea2514c31ada9d133fe83a89");
            return;
        }
        this.mScroller.forceFinished(true);
        this.mHeaderView.setVisiableHeight(this.originHeaderViewHeight);
        this.mHeaderView.setVisibility(0);
        setScrollY(this.originHeaderViewHeight);
    }

    public boolean isPullToRefreshing() {
        return this.mPullRefreshing;
    }

    public void setPullTo2FExposeRefreshHeight(int i, int i2) {
        this.exposeModeRefreshHeight = i;
        this.unExposeModeRefreshHeight = i2;
    }

    public void setPullTo2FExposeHeight(int i) {
        this.originHeaderViewHeight = i;
    }

    public void onRefreshComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11d509e6d68fa87efb0ce0fa24323ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11d509e6d68fa87efb0ce0fa24323ae5");
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: com.dianping.shield.component.widgets.secondfloor.PullTo2FRecyclerView.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "99b755826c73ce4cd6ab3121ea210168", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "99b755826c73ce4cd6ab3121ea210168");
                    } else if (PullTo2FRecyclerView.this.isPullToRefreshing()) {
                        PullTo2FRecyclerView.this.mPullRefreshing = false;
                        PullTo2FRecyclerView.this.resetHeaderHeight();
                    }
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRefreshCompleteNow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5ede51c3471140941eb0965545fc2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5ede51c3471140941eb0965545fc2c5");
        } else if (isPullToRefreshing()) {
            this.mPullRefreshing = false;
            resetHeaderHeight();
        }
    }

    public void onRefreshComplete(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aecb8d670379bda9b2e86bfb315e7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aecb8d670379bda9b2e86bfb315e7d5");
        } else if (this.mHeaderView != null) {
            this.mHeaderView.a(z);
        }
    }

    public void setJumpListener(CommonPageContainer.OnJumpListener onJumpListener) {
        this.gcOnJumpListener = onJumpListener;
    }

    public void setRefreshListener(CommonPageContainer.OnRefreshListener onRefreshListener) {
        this.onRefreshListener = onRefreshListener;
    }

    public b getHeaderView() {
        return this.mHeaderView;
    }

    private void updateHeaderHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "527ae99b67caaa7dda4213dcb6a10f1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "527ae99b67caaa7dda4213dcb6a10f1b");
            return;
        }
        this.mHeaderView.setVisiableHeight(((int) f) + this.mHeaderView.getVisiableHeight());
        if (this.mHeaderView.getVisiableHeight() > this.refreshHeight) {
            if (this.mMode.canPullDown() && !this.mPullRefreshing) {
                if (this.mHeaderView.getVisiableHeight() > this.refreshHeight) {
                    if (this.mMode.is2FMode()) {
                        if (this.mHeaderView.getVisiableHeight() > getJumpHeight()) {
                            this.mHeaderView.setState(3);
                        } else {
                            this.mHeaderView.setState(1);
                        }
                    } else {
                        this.mHeaderView.setState(1);
                    }
                } else {
                    this.mHeaderView.setState(0);
                }
            }
        } else if (!this.mPullRefreshing) {
            this.mHeaderView.a(this.mHeaderView.getVisiableHeight() / this.refreshHeight);
            this.mHeaderView.setState(0);
        }
        this.manager.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetHeaderHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3796bcf2f2d918f8be720e4cba95fa50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3796bcf2f2d918f8be720e4cba95fa50");
            return;
        }
        int visiableHeight = this.mHeaderView.getVisiableHeight();
        if (visiableHeight == 0) {
            return;
        }
        if (!this.mPullRefreshing || visiableHeight > this.refreshHeight) {
            int i = this.originHeaderViewHeight;
            if (this.mPullRefreshing && visiableHeight > this.refreshHeight) {
                i = this.refreshHeight;
            }
            if (!this.mPullRefreshing && this.mMode.canPullDown() && this.mMode.is2FMode() && this.mHeaderView.getVisiableHeight() > getJumpHeight() && this.isGoingToJump) {
                this.isGoingToJump = false;
                i = aq.b(getContext()) + 500;
                this.mHeaderView.setVisibility(4);
            }
            this.mScroller.startScroll(0, visiableHeight, 0, i - visiableHeight, 400);
            this.isScroll = true;
            invalidate();
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9fe9b125cfeb318c6cc0a6be6008ab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9fe9b125cfeb318c6cc0a6be6008ab7");
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new RuntimeException("PullToRefreshRecyclerView must set LinearLayoutManager");
        } else {
            super.setLayoutManager(layoutManager);
            this.manager = (LinearLayoutManager) layoutManager;
        }
    }

    @Override // com.dianping.shield.component.widgets.PageContainerRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c81ad2af4fdd643ecd2b1a0f4fdf2d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c81ad2af4fdd643ecd2b1a0f4fdf2d7")).booleanValue();
        }
        if (this.mLastY == -1.0f) {
            this.mLastY = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastY = motionEvent.getRawY();
            Log.e("PullTo2F DOWN", "mLastMotionY:" + this.mLastY);
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.mLastY;
            this.mLastY = motionEvent.getRawY();
            if (this.mMode.canPullDown()) {
                if (this.mMode == Mode.PULL_DOWN_TO_2F_EXPOSE) {
                    if (this.manager.findFirstCompletelyVisibleItemPosition() > 0 || this.manager.findFirstCompletelyVisibleItemPosition() == -1) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.manager.findFirstCompletelyVisibleItemPosition() == 0 && rawY < 0.0f && this.mHeaderView.getVisiableHeight() == this.mHeaderView.getInitHeight()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if ((rawY > 0.0f || this.mHeaderView.getVisiableHeight() > 0) && this.manager.findFirstCompletelyVisibleItemPosition() <= 1) {
                        updateHeaderHeight(rawY / OFFSET_RADIO);
                    }
                    return super.onTouchEvent(motionEvent);
                } else if ((this.manager.findFirstCompletelyVisibleItemPosition() == 1 || this.manager.findFirstCompletelyVisibleItemPosition() == 0 || ((getAdapter().getItemCount() == getHeaderCounts() && this.manager.findFirstCompletelyVisibleItemPosition() == -1) || (this.manager.findViewByPosition(1) != null && this.manager.findViewByPosition(1).getTop() >= 0))) && (rawY > 0.0f || this.mHeaderView.getVisiableHeight() > 0)) {
                    updateHeaderHeight(rawY / OFFSET_RADIO);
                }
            }
        } else {
            this.mLastY = -1.0f;
            if (this.mMode.canPullDown() && (this.manager.findFirstCompletelyVisibleItemPosition() == 1 || this.manager.findFirstCompletelyVisibleItemPosition() == 0)) {
                if (this.mHeaderView.getVisiableHeight() > this.refreshHeight && !this.mPullRefreshing) {
                    if (this.mMode.is2FMode() && this.mHeaderView.getVisiableHeight() > getJumpHeight()) {
                        this.isGoingToJump = true;
                        startActivity();
                    } else {
                        this.isGoingToJump = false;
                        this.mPullRefreshing = true;
                        this.mHeaderView.setState(2);
                        this.isHeaderRefresh = true;
                    }
                } else {
                    this.isGoingToJump = false;
                }
                resetHeaderHeight();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.dianping.shield.component.widgets.PageContainerRecyclerView, android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30794e7c337fee3fb04fc722385764f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30794e7c337fee3fb04fc722385764f6");
            return;
        }
        if (this.mScroller.computeScrollOffset()) {
            this.mHeaderView.setVisiableHeight(this.mScroller.getCurrY());
            postInvalidate();
        } else if (this.isHeaderRefresh) {
            if (this.onRefreshListener != null) {
                this.onRefreshListener.onRefresh(this);
            }
            this.isHeaderRefresh = false;
        } else if (this.isScroll && !this.mPullRefreshing) {
            this.mHeaderView.a();
            this.isScroll = false;
        }
        int findFirstVisibleItemPosition = this.manager.findFirstVisibleItemPosition();
        View findViewByPosition = this.manager.findViewByPosition(getHeaderCounts());
        if (findFirstVisibleItemPosition > getHeaderCounts()) {
            if (this.firstItemScrollListener != null) {
                this.firstItemScrollListener.onScrollChanged(0, 0, false);
            }
        } else if (findViewByPosition == null) {
        } else {
            if (this.mMode == Mode.PULL_DOWN_TO_2F_EXPOSE) {
                int top = findViewByPosition.getTop();
                if (this.firstItemScrollListener != null) {
                    this.firstItemScrollListener.onScrollChanged(top, findViewByPosition.getMeasuredHeight(), true);
                }
            } else if (this.mHeaderView.getVisiableHeight() > 0) {
                if (this.firstItemScrollListener != null) {
                    this.firstItemScrollListener.onScrollChanged(this.mHeaderView.getVisiableHeight(), findViewByPosition.getMeasuredHeight(), true);
                }
            } else if (this.manager.findFirstVisibleItemPosition() == getHeaderCounts()) {
                int top2 = findViewByPosition.getTop();
                if (this.firstItemScrollListener != null) {
                    this.firstItemScrollListener.onScrollChanged(top2, findViewByPosition.getMeasuredHeight(), true);
                }
            }
        }
    }

    private double getJumpHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed4cbffbf627d63f5dfd95d6f155e339", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed4cbffbf627d63f5dfd95d6f155e339")).doubleValue() : aq.b(getContext()) * this.pullTo2Scale;
    }

    private void startActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecff194b01213b0289b19a16f445032d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecff194b01213b0289b19a16f445032d");
        } else if (this.gcOnJumpListener != null) {
            this.gcOnJumpListener.onJump();
        }
    }
}
