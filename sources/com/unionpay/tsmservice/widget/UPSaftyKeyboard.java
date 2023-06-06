package com.unionpay.tsmservice.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.dianping.shield.entity.ExposeAction;
import com.unionpay.tsmservice.ITsmCallback;
import com.unionpay.tsmservice.OnSafetyKeyboardCallback;
import com.unionpay.tsmservice.UPTsmAddon;
import com.unionpay.tsmservice.data.NinePatchInfo;
import com.unionpay.tsmservice.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.result.GetEncryptDataResult;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes6.dex */
public class UPSaftyKeyboard {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private Typeface J;
    private boolean K;
    private OnShowListener L;
    private OnHideListener M;
    private OnEditorListener N;
    private OnSafetyKeyboardCallback.Stub O;
    private UPTsmAddon.UPTsmConnectionListener P;
    private Handler.Callback Q;
    private final Handler R;
    private Context a;
    private UPTsmAddon b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    /* loaded from: classes6.dex */
    public interface OnEditorListener {
        void onEditorChanged(int i);
    }

    /* loaded from: classes6.dex */
    public interface OnHideListener {
        void onHide();
    }

    /* loaded from: classes6.dex */
    public interface OnShowListener {
        void onShow();
    }

    /* loaded from: classes6.dex */
    public final class a extends OnSafetyKeyboardCallback.Stub {
        a() {
        }

        @Override // com.unionpay.tsmservice.OnSafetyKeyboardCallback
        public final void onEditorChanged(int i) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.arg1 = i;
            UPSaftyKeyboard.this.R.sendMessage(obtain);
        }

        @Override // com.unionpay.tsmservice.OnSafetyKeyboardCallback
        public final void onHide() throws RemoteException {
            UPSaftyKeyboard.this.R.sendEmptyMessage(1);
        }

        @Override // com.unionpay.tsmservice.OnSafetyKeyboardCallback
        public final void onShow() throws RemoteException {
            UPSaftyKeyboard.this.R.sendEmptyMessage(0);
        }
    }

    /* loaded from: classes6.dex */
    public final class b extends FutureTask<String> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public final class a extends ITsmCallback.Stub {
            a() {
            }

            @Override // com.unionpay.tsmservice.ITsmCallback
            public final void onError(String str, String str2) throws RemoteException {
                b.this.set("");
            }

            @Override // com.unionpay.tsmservice.ITsmCallback
            public final void onResult(Bundle bundle) throws RemoteException {
                bundle.setClassLoader(GetEncryptDataResult.class.getClassLoader());
                b.this.set(((GetEncryptDataResult) bundle.get("result")).getData());
            }
        }

        public b() {
            super(new Callable<String>() { // from class: com.unionpay.tsmservice.widget.UPSaftyKeyboard.b.1
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ String call() throws Exception {
                    throw new IllegalStateException("this should never be called");
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a(TimeUnit timeUnit) {
            try {
                try {
                    return get(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, timeUnit);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    cancel(true);
                    return "";
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                    cancel(true);
                    return "";
                } catch (TimeoutException e3) {
                    e3.printStackTrace();
                    cancel(true);
                    return "";
                }
            } finally {
                cancel(true);
            }
        }

        static /* synthetic */ void a(b bVar, String str) {
            GetEncryptDataRequestParams getEncryptDataRequestParams = new GetEncryptDataRequestParams();
            getEncryptDataRequestParams.setPan(str);
            getEncryptDataRequestParams.setType(UPSaftyKeyboard.this.c);
            try {
                UPSaftyKeyboard.this.b.getEncryptData(getEncryptDataRequestParams, new a());
            } catch (RemoteException e) {
                e.printStackTrace();
                bVar.set("");
            }
        }
    }

    public UPSaftyKeyboard(Context context, int i) throws RemoteException {
        this(context, i, null);
    }

    public UPSaftyKeyboard(Context context, int i, Drawable drawable) throws RemoteException {
        this.a = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.y = 1;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -16777216;
        this.K = false;
        this.Q = new Handler.Callback() { // from class: com.unionpay.tsmservice.widget.UPSaftyKeyboard.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        if (UPSaftyKeyboard.this.L != null) {
                            UPSaftyKeyboard.this.L.onShow();
                        }
                        return true;
                    case 1:
                        if (UPSaftyKeyboard.this.M != null) {
                            UPSaftyKeyboard.this.M.onHide();
                        }
                        UPSaftyKeyboard.c(UPSaftyKeyboard.this);
                        return true;
                    case 2:
                        if (UPSaftyKeyboard.this.N != null) {
                            UPSaftyKeyboard.this.d = message.arg1;
                            UPSaftyKeyboard.this.N.onEditorChanged(UPSaftyKeyboard.this.d);
                        }
                        return true;
                    default:
                        return false;
                }
            }
        };
        this.R = new Handler(Looper.getMainLooper(), this.Q);
        this.a = context;
        this.c = i;
        if (i < 2000 || i > 2001) {
            throw new IllegalArgumentException("Type is error");
        }
        this.b = UPTsmAddon.getInstance(this.a);
        if (this.b.isConnected()) {
            a();
        } else {
            this.P = new UPTsmAddon.UPTsmConnectionListener() { // from class: com.unionpay.tsmservice.widget.UPSaftyKeyboard.2
                @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
                public final void onTsmConnected() {
                    UPSaftyKeyboard.this.a();
                }

                @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
                public final void onTsmDisconnected() {
                }
            };
            this.b.addConnectionListener(this.P);
            this.b.bind();
        }
        if (drawable != null) {
            try {
                setKeyboardBackground(drawable);
            } catch (KeyboardDrawableErrorException e) {
                e.printStackTrace();
            }
        }
    }

    private String a(String str) {
        b bVar = new b();
        b.a(bVar, str);
        return bVar.a(TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.b != null) {
            try {
                this.b.clearEncryptData(this.c);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private void a(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setDoneForeBitmap(((BitmapDrawable) drawable).getBitmap());
        } else if (c == 1) {
            throw new KeyboardDrawableErrorException();
        }
        a(safetyKeyboardRequestParams);
    }

    private void a(SafetyKeyboardRequestParams safetyKeyboardRequestParams) throws RemoteException {
        this.b.setSafetyKeyboardBitmap(safetyKeyboardRequestParams);
    }

    private void b(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setDelForeBitmap(((BitmapDrawable) drawable).getBitmap());
        } else if (c == 1) {
            throw new KeyboardDrawableErrorException();
        }
        a(safetyKeyboardRequestParams);
    }

    private static int c(Drawable drawable) {
        if (drawable == null) {
            return -1;
        }
        if (drawable instanceof BitmapDrawable) {
            return 0;
        }
        if (drawable instanceof ColorDrawable) {
            return 1;
        }
        return drawable instanceof NinePatchDrawable ? 2 : -1;
    }

    static /* synthetic */ OnSafetyKeyboardCallback.Stub c(UPSaftyKeyboard uPSaftyKeyboard) {
        uPSaftyKeyboard.O = null;
        return null;
    }

    private static NinePatchInfo d(Drawable drawable) {
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
        NinePatchInfo ninePatchInfo = new NinePatchInfo();
        Rect rect = new Rect();
        ninePatchDrawable.getPadding(rect);
        ninePatchInfo.setPadding(rect);
        Drawable.ConstantState constantState = ninePatchDrawable.getConstantState();
        try {
            Field declaredField = Class.forName("android.graphics.drawable.NinePatchDrawable$NinePatchState").getDeclaredField("mNinePatch");
            declaredField.setAccessible(true);
            Bitmap bitmap = (Bitmap) Class.forName("android.graphics.NinePatch").getDeclaredMethod("getBitmap", new Class[0]).invoke(declaredField.get(constantState), new Object[0]);
            ninePatchInfo.setBitmap(bitmap);
            ninePatchInfo.setChunk(bitmap.getNinePatchChunk());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ninePatchInfo;
    }

    public synchronized boolean clearPwd() {
        this.d = 0;
        int i = -5;
        try {
            i = this.b.clearEncryptData(this.c);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return i == 0;
    }

    public void enableLightStatusBar(boolean z) {
        this.K = z;
    }

    public int getCurrentPinLength() {
        return this.d;
    }

    public String getInput() {
        return a("");
    }

    public String getInput(String str) {
        return this.c != 2000 ? "" : a(str);
    }

    public boolean hide() {
        int i;
        try {
            i = this.b.hideKeyboard();
        } catch (RemoteException e) {
            e.printStackTrace();
            i = -5;
        }
        return i == 0;
    }

    public void setConfirmBtnOutPaddingRight(int i) {
        this.v = i;
    }

    public void setConfirmBtnSize(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    public void setDelKeyDrawable(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        if (drawable != null) {
            b(drawable);
        }
    }

    public void setDelKeyDrawable(Drawable drawable, Drawable drawable2) throws KeyboardDrawableErrorException, RemoteException {
        if (drawable != null) {
            b(drawable);
        }
        if (drawable2 != null) {
            int c = c(drawable2);
            if (c == -1) {
                throw new KeyboardDrawableErrorException();
            }
            SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
            if (c == 0) {
                safetyKeyboardRequestParams.setDelBgBitmap(((BitmapDrawable) drawable2).getBitmap());
                safetyKeyboardRequestParams.setDelBgColor(-1);
            } else if (c == 1) {
                safetyKeyboardRequestParams.setDelBgColor(((ColorDrawable) drawable2).getColor());
            } else if (c == 2) {
                safetyKeyboardRequestParams.setDelKeyBgNinePatch(d(drawable2));
            }
            a(safetyKeyboardRequestParams);
        }
    }

    public void setDoneKeyDrawable(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        if (drawable != null) {
            a(drawable);
        }
    }

    public void setDoneKeyDrawable(Drawable drawable, Drawable drawable2) throws KeyboardDrawableErrorException, RemoteException {
        if (drawable != null) {
            a(drawable);
        }
        if (drawable2 != null) {
            int c = c(drawable2);
            if (c == -1) {
                throw new KeyboardDrawableErrorException();
            }
            SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
            if (c == 0) {
                safetyKeyboardRequestParams.setDoneBgBitmap(((BitmapDrawable) drawable2).getBitmap());
                safetyKeyboardRequestParams.setDoneBgColor(-1);
            } else if (c == 1) {
                safetyKeyboardRequestParams.setDoneBgColor(((ColorDrawable) drawable2).getColor());
            } else if (c == 2) {
                safetyKeyboardRequestParams.setDoneKeyBgNinePatch(d(drawable2));
            }
            a(safetyKeyboardRequestParams);
        }
    }

    public void setDoneKeyEnable(boolean z) {
        this.B = z;
    }

    public void setDoneKeyRightMode(boolean z) {
        this.A = z;
    }

    public void setKeyAreaPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.t = i4;
    }

    public void setKeyBoardSize(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public void setKeyboardAudio(boolean z) {
        this.z = z;
    }

    public void setKeyboardBackground(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setKeyboardBgBitmap(((BitmapDrawable) drawable).getBitmap());
            safetyKeyboardRequestParams.setKeyboardBgColor(-1);
        } else if (c == 1) {
            safetyKeyboardRequestParams.setKeyboardBgColor(((ColorDrawable) drawable).getColor());
        } else if (c == 2) {
            safetyKeyboardRequestParams.setKeyboardBgNinePatch(d(drawable));
        }
        a(safetyKeyboardRequestParams);
    }

    public void setKeyboardPadding(int i, int i2, int i3, int i4) {
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = i4;
    }

    public void setKeyboardStartPosition(int i, int i2) {
        this.w = i;
        this.x = i2;
        this.y = 0;
    }

    public void setKeyboardVibrate(boolean z) {
        this.C = z;
    }

    public void setNumKeyBackgroud(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setNumBgBitmap(((BitmapDrawable) drawable).getBitmap());
            safetyKeyboardRequestParams.setNumBgColor(-1);
        } else if (c == 1) {
            safetyKeyboardRequestParams.setNumBgColor(((ColorDrawable) drawable).getColor());
        } else if (c == 2) {
            safetyKeyboardRequestParams.setNumKeyBgNinePatch(d(drawable));
        }
        a(safetyKeyboardRequestParams);
    }

    public void setNumKeyMargin(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public void setNumberKeyColor(int i) {
        this.I = i;
    }

    public void setNumberKeyDrawable(Drawable[] drawableArr) throws KeyboardDrawableErrorException, RemoteException {
        char c = 65535;
        if (drawableArr != null && drawableArr.length > 0) {
            int length = drawableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c = 0;
                    break;
                } else if (!(drawableArr[i] instanceof BitmapDrawable)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c != 0) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        ArrayList<Bitmap> arrayList = new ArrayList<>();
        for (Drawable drawable : drawableArr) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                arrayList.add(bitmapDrawable.getBitmap());
            }
        }
        safetyKeyboardRequestParams.setNumForeBitmaps(arrayList);
        a(safetyKeyboardRequestParams);
    }

    public void setNumberKeySize(int i) {
        this.u = i;
    }

    public void setOnEditorListener(OnEditorListener onEditorListener) {
        this.N = onEditorListener;
    }

    public void setOnHideListener(OnHideListener onHideListener) {
        this.M = onHideListener;
    }

    public void setOnShowListener(OnShowListener onShowListener) {
        this.L = onShowListener;
    }

    public void setTitleBackground(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setTitleBgBitmap(((BitmapDrawable) drawable).getBitmap());
            safetyKeyboardRequestParams.setTitleBgColor(-1);
        } else if (c == 1) {
            safetyKeyboardRequestParams.setTitleBgColor(((ColorDrawable) drawable).getColor());
        } else if (c == 2) {
            safetyKeyboardRequestParams.setTitleBgNinePatch(d(drawable));
        }
        a(safetyKeyboardRequestParams);
    }

    public void setTitleColor(int i) {
        this.G = i;
    }

    public void setTitleConfirmDrawable(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setTitleDropBitmap(((BitmapDrawable) drawable).getBitmap());
        } else if (c == 1) {
            throw new KeyboardDrawableErrorException();
        }
        a(safetyKeyboardRequestParams);
    }

    public void setTitleDrawable(Drawable drawable) throws KeyboardDrawableErrorException, RemoteException {
        int c = c(drawable);
        if (c == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (c == 0) {
            safetyKeyboardRequestParams.setTitleIconBitmap(((BitmapDrawable) drawable).getBitmap());
        } else if (c == 1) {
            throw new KeyboardDrawableErrorException();
        }
        a(safetyKeyboardRequestParams);
    }

    public void setTitleDrawablePadding(int i) {
        this.F = i;
    }

    public void setTitleDrawableSize(int i, int i2) {
        this.D = i;
        this.E = i2;
    }

    public void setTitleFont(Typeface typeface) {
        this.J = typeface;
    }

    public void setTitleHeight(int i) {
        this.j = i;
    }

    public void setTitleSize(int i) {
        this.H = i;
    }

    public void setTitleText(String str) {
        this.e = str;
    }

    public synchronized boolean show() {
        if (this.O == null) {
            this.O = new a();
            try {
                SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
                safetyKeyboardRequestParams.setTitle(this.e);
                safetyKeyboardRequestParams.setKeyboardWidth(this.f);
                safetyKeyboardRequestParams.setKeyboardHeight(this.g);
                safetyKeyboardRequestParams.setConfirmBtnWidth(this.h);
                safetyKeyboardRequestParams.setConfirmBtnHeight(this.i);
                safetyKeyboardRequestParams.setTitleHeight(this.j);
                safetyKeyboardRequestParams.setMarginRow(this.k);
                safetyKeyboardRequestParams.setMarginCol(this.l);
                safetyKeyboardRequestParams.setOutPaddingLeft(this.m);
                safetyKeyboardRequestParams.setOutPaddingRight(this.o);
                safetyKeyboardRequestParams.setOutPaddingTop(this.n);
                safetyKeyboardRequestParams.setOutPaddingBottom(this.p);
                safetyKeyboardRequestParams.setInnerPaddingLeft(this.q);
                safetyKeyboardRequestParams.setInnerPaddingRight(this.s);
                safetyKeyboardRequestParams.setInnerPaddingTop(this.r);
                safetyKeyboardRequestParams.setInnerPaddingBottom(this.t);
                safetyKeyboardRequestParams.setNumSize(this.u);
                safetyKeyboardRequestParams.setConfirmBtnOutPaddingRight(this.v);
                safetyKeyboardRequestParams.setStartX(this.w);
                safetyKeyboardRequestParams.setStartY(this.x);
                safetyKeyboardRequestParams.setDefaultPosition(this.y);
                safetyKeyboardRequestParams.setIsAudio(this.z ? 1 : 0);
                safetyKeyboardRequestParams.setDoneRight(this.A ? 1 : 0);
                safetyKeyboardRequestParams.setEnableOKBtn(this.B ? 1 : 0);
                safetyKeyboardRequestParams.setIsVibrate(this.C ? 1 : 0);
                safetyKeyboardRequestParams.setSecureWidth(this.D);
                safetyKeyboardRequestParams.setSecureHeight(this.E);
                safetyKeyboardRequestParams.setTitleDrawablePadding(this.F);
                safetyKeyboardRequestParams.setTitleColor(this.G);
                safetyKeyboardRequestParams.setTitleSize(this.H);
                safetyKeyboardRequestParams.setNumberKeyColor(this.I);
                if (this.J != null) {
                    safetyKeyboardRequestParams.setTitleFont(this.J.getStyle());
                }
                safetyKeyboardRequestParams.setEnableLightStatusBar(this.K);
                if (this.b.showSafetyKeyboard(safetyKeyboardRequestParams, this.c, this.O, this.a) != 0) {
                    this.O = null;
                    return false;
                }
                return true;
            } catch (RemoteException e) {
                e.printStackTrace();
                this.O = null;
                return false;
            }
        }
        return false;
    }
}
