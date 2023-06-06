package com.meituan.android.yoda.widget.tool;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.meituan.android.cipstorage.q;
import com.meituan.android.facedetection.algo.FaceLivenessDet;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.p;
import com.meituan.android.yoda.YodaFaceDetectionResponseListener;
import com.meituan.android.yoda.bean.FeLiveType;
import com.meituan.android.yoda.util.l;
import com.meituan.android.yoda.util.s;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.z;
import com.meituan.android.yoda.widget.view.AutoFitSurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CameraManager implements Camera.PreviewCallback {
    private static final int DEBOUNCE_VALVE = 4;
    private static final int FACE_DETECT_FAIL = 9002;
    private static final int FACE_DETECT_SUCCESS = 200;
    private static final int FD_FD_STRATEGY_NO_MASK = 1;
    private static final int FD_FD_STRATEGY_WITH_MASK = 3;
    private static final int FD_RESULT_ERROR_FACE_BLURRY = -13;
    private static final int FD_RESULT_ERROR_FACE_LIGHT_EXCEPTION = -12;
    private static final int FD_RESULT_ERROR_FACE_MASK = -11;
    private static final int FD_RESULT_ERROR_FACE_POSE_FAIL = -8;
    private static final int FD_RESULT_ERROR_FACE_TOO_BIG = -10;
    private static final int FD_RESULT_ERROR_FACE_TOO_DARK = -14;
    private static final int FD_RESULT_ERROR_FACE_TOO_LIGHT = -15;
    private static final int FD_RESULT_ERROR_FACE_TOO_SMALL = -9;
    private static final int FD_RESULT_ERROR_FACE_WITH_MASK = -16;
    private static final int FD_RESULT_ERROR_INIT_FAIL = -3;
    private static final int FD_RESULT_ERROR_INPUT_SIZE_FAIL = -2;
    private static final int FD_RESULT_ERROR_MEM_MALLOC_FAIL = -4;
    private static final int FD_RESULT_ERROR_NO_FACE_FOUND = -7;
    private static final int FD_RESULT_ERROR_OUTPUT_SIZE_FAIL = -1;
    private static final int FD_RESULT_ERROR_OUT_BOUNDS = -5;
    private static final int FD_RESULT_ERROR_PIC_LESS_THAN_THREE = -6;
    private static final int FD_RESULT_FAIL = 2;
    private static final int FD_RESULT_PASS_NO_MASK = 1;
    private static final int FD_RESULT_PASS_WITH_MASK = 3;
    protected static final int FD_STEP_ACTION_GROUP = 6;
    protected static final int FD_STEP_BLINK = 1;
    protected static final int FD_STEP_OPEN_MOUTH = 2;
    protected static final int FD_STEP_RAY = 5;
    protected static final int FD_STEP_UP_HEAD = 3;
    protected static final int FD_STEP_WAVE_HEAD = 4;
    private static final int PREVIEW_FRAME_HEIGHT = 1280;
    private static final int PREVIEW_FRAME_WIDTH = 720;
    private static final int ROTATION_DEGREES_0 = 0;
    private static final int ROTATION_DEGREES_180 = 180;
    private static final int ROTATION_DEGREES_270 = 270;
    private static final int ROTATION_DEGREES_360 = 360;
    private static final int ROTATION_DEGREES_90 = 90;
    private static final String TAG = "CameraManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static CameraManager instance = new CameraManager();
    private final int MEG_FACE_RAY;
    private int[] actionSeq;
    public byte[] check;
    private int curActionIndex;
    public byte[] encodeData;
    public int[] encodeDataLen;
    private int errorCode;
    public byte[] faceRect;
    private boolean isCaptureAFrame;
    private boolean isDebug;
    private boolean isSaveEncoded;
    private boolean isSaveSource;
    private com.meituan.android.yoda.util.g mAvcEncoder;
    private p mCamera;
    private com.meituan.android.yoda.widget.view.d mCameraSurfacePreview;
    private WeakReference<Context> mContextWeakReference;
    private int mCurRayIndex;
    private boolean mCurRayPass;
    private ExecutorService mExecutorService;
    private long mFaceLiveActionStartTime;
    private FaceLivenessDet mFaceLivenessDet;
    private String[] mFaceRay;
    private int mFaceRayDuration;
    private int mFaceRayPicLeastNum;
    private FeLiveType mFeLiveType;
    private int mFileLimit;
    private String mFileRegex;
    private Handler mHandler;
    private Handler.Callback mHandlerCallback;
    private int mHeight;
    private IDetection mIDetection;
    private boolean mIsCameraOpen;
    private int mOpenFileCount;
    private Camera.PreviewCallback mPreviewCallback;
    public byte[][] mRayEncodeData;
    private ViewGroup mRoot;
    private Drawable mRootOriginalBackgroundColor;
    private int mSeqFaceRayCount;
    private HashMap<Integer, Integer> mStatus;
    public int mTempRayIndex;
    private int mWhich;
    private int mWidth;
    public HashMap<String, String> paraList;
    public int passType;
    private final int previewFrameRatio;
    public AtomicBoolean previewRunning;
    private long previewStartTime;
    public byte[][] rayCheck;
    public int[][] rayEncodeDataLen;
    public byte[][] rayFaceRect;
    public boolean[] rayGetBestFrame;
    public int rayResult;
    private int seqCounter;
    private String tips;
    private final int videoBitRate;
    private String videoPath;
    public boolean videoRecord;
    public int[] yuvsize;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public interface IDetection {
        void onCameraError();

        void onFaceImageReady(com.meituan.android.yoda.model.a[] aVarArr, String str, HashMap<String, String> hashMap);

        void onFileReady(File file);

        void onSuccess();
    }

    public static /* synthetic */ int access$008(CameraManager cameraManager) {
        int i = cameraManager.mCurRayIndex;
        cameraManager.mCurRayIndex = i + 1;
        return i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public FeLiveType getFeLiveType() {
        return this.mFeLiveType;
    }

    public void setFeLiveType(FeLiveType feLiveType) {
        Object[] objArr = {feLiveType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5695f20bb5e2c952f37baa07f5df7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5695f20bb5e2c952f37baa07f5df7b6");
            return;
        }
        this.mFeLiveType = feLiveType;
        this.passType = 1;
        if (this.mFeLiveType != null) {
            this.passType = this.mFeLiveType.faceMaskDet == 1 ? 3 : 1;
            com.meituan.android.yoda.monitor.log.a.a(TAG, "setFeLiveType, mFeLiveType.faceMaskDet = " + this.mFeLiveType.faceMaskDet + ", passType = " + this.passType, true);
        }
    }

    public FaceLivenessDet getFaceLivenessDet() {
        return this.mFaceLivenessDet;
    }

    public void setFaceLivenessDet(FaceLivenessDet faceLivenessDet) {
        this.mFaceLivenessDet = faceLivenessDet;
    }

    public CameraManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b77a07e473934b814625cb2cf9eeb1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b77a07e473934b814625cb2cf9eeb1f");
            return;
        }
        this.previewFrameRatio = 45;
        this.videoBitRate = 8500000;
        this.MEG_FACE_RAY = 1;
        this.mExecutorService = com.sankuai.android.jarvis.c.a("yoda_face_handle_thread", 4);
        this.videoRecord = true;
        this.passType = 1;
        this.previewStartTime = 0L;
        this.mFaceLiveActionStartTime = 0L;
        this.yuvsize = null;
        this.encodeData = new byte[995328];
        this.encodeDataLen = new int[3];
        this.faceRect = new byte[264];
        this.check = new byte[132];
        this.seqCounter = 0;
        this.curActionIndex = 0;
        this.mSeqFaceRayCount = 0;
        this.mFaceRayDuration = 700;
        this.mCurRayIndex = 0;
        this.isSaveSource = false;
        this.isSaveEncoded = false;
        this.mWhich = -1;
        this.actionSeq = null;
        this.tips = "";
        this.isDebug = true;
        this.isCaptureAFrame = false;
        this.mStatus = new HashMap<>();
        this.paraList = new HashMap<>();
        this.previewRunning = new AtomicBoolean(false);
        this.mFileLimit = 0;
        this.mOpenFileCount = 0;
        this.mIsCameraOpen = false;
        this.videoPath = "";
        this.rayResult = -1;
        this.mTempRayIndex = 0;
        this.mHandlerCallback = new Handler.Callback() { // from class: com.meituan.android.yoda.widget.tool.CameraManager.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aefdf7ac1d809154f033c4959bbec012", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aefdf7ac1d809154f033c4959bbec012")).booleanValue();
                }
                if (message.what != 1) {
                    return false;
                }
                if (CameraManager.this.mCurRayIndex == 0 && !CameraManager.this.mCurRayPass) {
                    CameraManager.this.mHandler.sendEmptyMessageDelayed(1, CameraManager.this.mFaceRayDuration);
                } else {
                    com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "onPreviewFrame, current ray success. index:" + CameraManager.this.mCurRayIndex + StringUtil.SPACE + CameraManager.this.mCurRayPass, true);
                    if (CameraManager.this.mCurRayIndex < CameraManager.this.mSeqFaceRayCount) {
                        CameraManager.this.rayGetBestFrame[CameraManager.this.mCurRayIndex] = CameraManager.this.mCurRayPass;
                    }
                    if (CameraManager.this.mCurRayIndex + 1 < CameraManager.this.mSeqFaceRayCount) {
                        if (CameraManager.this.mCurRayIndex + 1 == 1 && CameraManager.this.mCameraSurfacePreview != null) {
                            CameraManager.this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_ray_face_handling), 0L);
                        }
                        CameraManager.this.setFaceRayColor(CameraManager.this.mCurRayIndex + 1);
                        CameraManager.this.mHandler.sendEmptyMessageDelayed(1, CameraManager.this.mFaceRayDuration);
                        CameraManager.access$008(CameraManager.this);
                        CameraManager.this.mCurRayPass = false;
                        com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "face detection face ray pass, next index is " + CameraManager.this.mCurRayIndex, true);
                    } else {
                        int i = 0;
                        for (int i2 = 0; i2 < CameraManager.this.rayGetBestFrame.length; i2++) {
                            if (CameraManager.this.rayGetBestFrame[i2]) {
                                i++;
                            }
                        }
                        CameraManager.this.mCurRayPass = false;
                        if (i >= CameraManager.this.mFaceRayPicLeastNum) {
                            if (CameraManager.this.mCurRayIndex + 1 == CameraManager.this.mSeqFaceRayCount) {
                                CameraManager.this.mHandler.removeMessages(1);
                                if (CameraManager.this.mCameraSurfacePreview != null) {
                                    CameraManager.this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_ray_face_waiting), 0L);
                                }
                                CameraManager.this.resetOriginalColor();
                            }
                            if (CameraManager.this.seqCounter == 0 && CameraManager.this.mCurRayIndex + 1 >= CameraManager.this.mSeqFaceRayCount && CameraManager.this.mIDetection != null) {
                                com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "onPreviewFrame, all ray success.", true);
                                CameraManager.this.processSuccessResult(CameraManager.this.mHeight, CameraManager.this.mWidth, CameraManager.this.mFaceLivenessDet.wrapGetAntionSequence());
                            }
                            CameraManager.access$008(CameraManager.this);
                            com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "face detection face ray pass, next index is " + CameraManager.this.mCurRayIndex, true);
                        } else {
                            CameraManager.this.restartFaceLiveAction();
                        }
                    }
                }
                return true;
            }
        };
        this.mHandler = new Handler(Looper.myLooper(), this.mHandlerCallback);
    }

    public static CameraManager getInstance() {
        return instance;
    }

    public boolean isSaveSource() {
        return this.isSaveSource;
    }

    public void setSaveSource(boolean z) {
        this.isSaveSource = z;
    }

    public boolean isSaveEncoded() {
        return this.isSaveEncoded;
    }

    public void setSaveEncoded(boolean z) {
        this.isSaveEncoded = z;
    }

    public int getWhich() {
        return this.mWhich;
    }

    public void setActionSeq(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1331a833462a9614929f4f32942eac02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1331a833462a9614929f4f32942eac02");
        } else if (iArr == null) {
        } else {
            this.seqCounter = iArr.length;
            this.actionSeq = iArr;
            this.curActionIndex = 0;
        }
    }

    public int[] getActionSeq() {
        return this.actionSeq;
    }

    public void setWhich(int i) {
        this.mWhich = i;
    }

    public void setFaceRay(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c62058a4e9d09292bb612eb282d7581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c62058a4e9d09292bb612eb282d7581");
        } else if (strArr == null || strArr.length <= 0) {
            this.mSeqFaceRayCount = 0;
            this.mFaceRay = null;
            this.mCurRayIndex = 0;
            this.mCurRayPass = false;
            this.mRayEncodeData = null;
            this.rayEncodeDataLen = null;
            this.rayFaceRect = null;
            this.rayCheck = null;
            this.rayGetBestFrame = null;
        } else {
            this.mSeqFaceRayCount = strArr.length;
            this.mFaceRay = strArr;
            this.mCurRayIndex = 0;
            this.mCurRayPass = false;
            com.meituan.android.yoda.monitor.log.a.a(TAG, "face detection face ray，mSeqFaceRayCount： " + this.mSeqFaceRayCount, true);
            this.mRayEncodeData = (byte[][]) Array.newInstance(byte.class, this.mSeqFaceRayCount, 331776);
            this.rayEncodeDataLen = (int[][]) Array.newInstance(int.class, this.mSeqFaceRayCount, 1);
            this.rayFaceRect = (byte[][]) Array.newInstance(byte.class, this.mSeqFaceRayCount, 88);
            this.rayCheck = (byte[][]) Array.newInstance(byte.class, this.mSeqFaceRayCount, 44);
            this.rayGetBestFrame = new boolean[this.mSeqFaceRayCount];
        }
    }

    public void setFaceRayParam(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71f0a323fa1a8fb890f798e7ed61934e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71f0a323fa1a8fb890f798e7ed61934e");
            return;
        }
        if (i <= 0) {
            i = 700;
        }
        this.mFaceRayDuration = i;
        if (i2 <= 0) {
            i2 = 0;
        }
        this.mFaceRayPicLeastNum = i2;
    }

    public void setFileLimit(int i) {
        this.mFileLimit = i;
    }

    public void setFileRegex(String str) {
        this.mFileRegex = str;
    }

    private String getTips(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f68bc3792daf8205fde40ffeea32451", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f68bc3792daf8205fde40ffeea32451");
        }
        if (i2 == 3) {
            switch (i) {
                case 1:
                    return x.a((int) R.string.yoda_face_with_mask_verify_blink_tip);
                case 2:
                    return x.a((int) R.string.yoda_face_with_mask_verify_open_mouth_tip);
                case 3:
                    return x.a((int) R.string.yoda_face_with_mask_verify_up_head_tip);
                case 4:
                    return x.a((int) R.string.yoda_face_with_mask_verify_swivel_head_tip);
                default:
                    return x.a((int) R.string.yoda_face_verify_unknown_error);
            }
        }
        switch (i) {
            case 1:
                return x.a((int) R.string.yoda_face_verify_blink_tip);
            case 2:
                return x.a((int) R.string.yoda_face_verify_open_mouth_tip);
            case 3:
                return x.a((int) R.string.yoda_face_verify_up_head_tip);
            case 4:
                return x.a((int) R.string.yoda_face_verify_swivel_head_tip);
            default:
                return x.a((int) R.string.yoda_face_verify_unknown_error);
        }
    }

    public void openCamera(Context context, ViewGroup viewGroup, int i, int i2) throws Exception {
        boolean z;
        Object[] objArr = {context, viewGroup, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd0128882626069574baac5d94c02f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd0128882626069574baac5d94c02f9c");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, width = " + i + ", height = " + i2, true);
        if (context == null || viewGroup == null || (i <= 0 && i2 <= 0)) {
            com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, param error.", true);
            return;
        }
        this.mRoot = viewGroup;
        try {
            if (this.mCamera != null) {
                this.mCamera.a((Camera.PreviewCallback) null);
                this.mCamera.f();
            }
            z = true;
        } catch (Exception unused) {
            z = true;
            com.meituan.android.yoda.monitor.log.a.a(TAG, "release mCamera if being used ", true);
        }
        setFeLiveType(this.mFeLiveType);
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i3 = 0;
        while (true) {
            if (i3 >= numberOfCameras) {
                break;
            }
            Camera.getCameraInfo(i3, cameraInfo);
            if (cameraInfo.facing == z) {
                this.mCamera = Privacy.createCamera("jcyf-3e2361e8b87eaf2d", i3);
                com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, mCamera = " + this.mCamera, z);
                break;
            }
            i3++;
            z = true;
        }
        this.mContextWeakReference = new WeakReference<>(context);
        if (this.mCamera != null) {
            Camera.Parameters b = this.mCamera.b();
            Camera.Size matchedSize = getMatchedSize(b.getSupportedPreviewSizes(), i, i2);
            try {
                b.setPreviewSize(PREVIEW_FRAME_HEIGHT, PREVIEW_FRAME_WIDTH);
            } catch (Exception e) {
                e.printStackTrace();
                com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, setPreviewSize exception = " + e.getMessage(), true);
            }
            try {
                b.setJpegQuality(100);
            } catch (Exception e2) {
                e2.printStackTrace();
                com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, setJpegQuality exception = " + e2.getMessage(), true);
            }
            Camera.Size matchedPicSize = getMatchedPicSize(b.getSupportedPictureSizes(), matchedSize.width / matchedSize.height);
            try {
                b.setPictureSize(matchedPicSize.width, matchedPicSize.height);
            } catch (Exception e3) {
                e3.printStackTrace();
                com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, setPictureSize exception = " + e3.getMessage(), true);
            }
            this.mCamera.b(calculateCameraDisplayOrientation(context, cameraInfo));
            this.mCamera.a(b);
            this.mCamera.a(this);
            this.mCameraSurfacePreview = new com.meituan.android.yoda.widget.view.d(context, viewGroup);
            this.mCameraSurfacePreview.a(getTips(this.mWhich, this.passType), 200L);
            viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            com.meituan.android.yoda.widget.view.d dVar = this.mCameraSurfacePreview;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = AutoFitSurfaceView.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "f17fa72ccc32b634ef89436ab0a84e37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "f17fa72ccc32b634ef89436ab0a84e37");
            } else if (i < 0 || i2 < 0) {
                throw new IllegalArgumentException("Size cannot be negative.");
            } else {
                dVar.b = i;
                dVar.c = i2;
                dVar.requestLayout();
            }
            this.mCameraSurfacePreview.setCamera(this.mCamera);
            this.mCameraSurfacePreview.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        } else if (this.mIDetection != null) {
            this.mIDetection.onCameraError();
        }
        viewGroup.post(a.a(this, viewGroup));
    }

    public static /* synthetic */ void lambda$openCamera$9(CameraManager cameraManager, ViewGroup viewGroup) {
        Object[] objArr = {cameraManager, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95244eb9e84caf731a3f215e2a9da00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95244eb9e84caf731a3f215e2a9da00c");
        } else if (cameraManager.mCameraSurfacePreview != null) {
            try {
                if (cameraManager.mCameraSurfacePreview.getParent() != null) {
                    ViewParent parent = cameraManager.mCameraSurfacePreview.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeAllViews();
                    }
                }
                viewGroup.removeAllViews();
                viewGroup.addView(cameraManager.mCameraSurfacePreview);
                com.meituan.android.yoda.widget.view.d dVar = cameraManager.mCameraSurfacePreview;
                Object[] objArr2 = {viewGroup};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.widget.view.d.d;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "1e21870326d711e5d2e37394f0f34a0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "1e21870326d711e5d2e37394f0f34a0c");
                } else if (dVar.h != null && viewGroup != null && dVar.f != null) {
                    dVar.i = new TextView(dVar.h);
                    dVar.i.setTextSize(0, dVar.f.f());
                    if (!TextUtils.isEmpty(dVar.k)) {
                        dVar.i.setText(dVar.k);
                    }
                    dVar.i.setTextColor(dVar.f.e());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 1);
                    layoutParams.topMargin = (int) (dVar.f.d() - dVar.f.f());
                    dVar.i.setLayoutParams(layoutParams);
                    viewGroup.addView(dVar.i);
                    dVar.i.postDelayed(dVar.j, 500L);
                }
                com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, camera surface layer added.", true);
            } catch (Throwable th) {
                com.meituan.android.yoda.monitor.log.a.a(TAG, "openCamera, add camera surface layer throwable = " + th.getMessage(), true);
            }
        }
    }

    public void startPreview() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f3ebd476f3f6069b0182300cc9a9008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f3ebd476f3f6069b0182300cc9a9008");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(TAG, "startPreview", true);
        this.previewRunning.set(true);
        if (this.mCamera != null) {
            this.mCamera.d();
            this.mCamera.a(this);
            this.previewStartTime = System.currentTimeMillis();
            this.mFaceLiveActionStartTime = System.currentTimeMillis();
            this.mIsCameraOpen = true;
            d.a(this.mWhich, 1, 0L, (HashMap<String, String>) null);
            d.a(this.actionSeq, 1, 0L, (HashMap<String, String>) null);
        }
        try {
            if (!this.videoRecord || Build.VERSION.SDK_INT < 18) {
                return;
            }
            this.mAvcEncoder = new com.meituan.android.yoda.util.g(this.mContextWeakReference, PREVIEW_FRAME_HEIGHT, PREVIEW_FRAME_WIDTH, 45, 8500000);
            if (this.mContextWeakReference == null || this.mContextWeakReference.get() == null) {
                return;
            }
            File a = q.a(this.mContextWeakReference.get().getApplicationContext(), "yoda", (String) null);
            if (!a.exists()) {
                a.mkdirs();
            }
            File file = new File(a, "test.mp4");
            if (!file.exists()) {
                file.createNewFile();
            }
            this.videoPath = file.getAbsolutePath();
            this.mAvcEncoder.a(this.videoPath);
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a(TAG, "startPreview, exception = " + e.getMessage(), true);
        }
    }

    public void stopPreview() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4afe6f3ec7724c45960e2a0e07a9fd34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4afe6f3ec7724c45960e2a0e07a9fd34");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(TAG, "stopPreview.", true);
        if (this.videoRecord && Build.VERSION.SDK_INT >= 18) {
            if (this.mAvcEncoder != null && this.mIDetection != null) {
                com.meituan.android.yoda.util.g gVar = this.mAvcEncoder;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.util.g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "575b1b50ac91eae2d80683ec5d159800", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "575b1b50ac91eae2d80683ec5d159800");
                } else {
                    gVar.d = false;
                    try {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.yoda.util.g.a;
                        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect4, false, "c906a3ee227a0723394593b05d5b5514", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect4, false, "c906a3ee227a0723394593b05d5b5514");
                        } else {
                            try {
                                gVar.h.stop();
                                gVar.h.release();
                                s sVar = gVar.i;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = s.a;
                                if (PatchProxy.isSupport(objArr4, sVar, changeQuickRedirect5, false, "53fcdf47712e88d0de2ebdf0426d6788", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, sVar, changeQuickRedirect5, false, "53fcdf47712e88d0de2ebdf0426d6788");
                                } else if (sVar.c != null && sVar.b != -1) {
                                    sVar.c.stop();
                                    sVar.c.release();
                                    sVar.c = null;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                this.mIDetection.onFileReady(new File(this.videoPath));
            }
            this.mAvcEncoder = null;
        }
        try {
            if (this.mCamera != null) {
                this.mCamera.e();
                this.mCamera.a((Camera.PreviewCallback) null);
            }
        } catch (Exception e3) {
            com.meituan.android.yoda.monitor.log.a.a(TAG, "stopPreview, exception = " + e3.getMessage(), true);
        }
        this.yuvsize = null;
        this.mIsCameraOpen = false;
        if (this.mHandler != null) {
            this.mHandler.removeMessages(1);
        }
        resetOriginalColor();
    }

    private Camera.Size getMatchedSize(List<Camera.Size> list, int i, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dd018f899828000fc350e9867adb09c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Size) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dd018f899828000fc350e9867adb09c");
        }
        Camera.Size size = null;
        int i3 = Integer.MAX_VALUE;
        if (list != null && list.size() > 0) {
            for (Camera.Size size2 : list) {
                int abs = Math.abs(size2.width - i2) + Math.abs(size2.height - i);
                if (abs == 0) {
                    return size2;
                }
                if (abs < i3) {
                    size = size2;
                    i3 = abs;
                }
            }
        }
        return size;
    }

    private Camera.Size getMatchedPicSize(List<Camera.Size> list, float f) {
        Object[] objArr = {list, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a0dcecaada0d792aab6884f6d4a0197", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Size) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a0dcecaada0d792aab6884f6d4a0197");
        }
        Camera.Size size = null;
        float f2 = Float.MAX_VALUE;
        if (list != null && list.size() > 0) {
            for (Camera.Size size2 : list) {
                if (Math.abs((size2.width / size2.height) - f) <= f2) {
                    f2 = Math.abs((size2.width / size2.height) - f);
                    size = size2;
                }
            }
        }
        return size;
    }

    public void closeCamera(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "661324ad62e02413657bce45befd8721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "661324ad62e02413657bce45befd8721");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(TAG, "closeCamera.", true);
        if (this.mCamera != null) {
            com.meituan.android.yoda.monitor.log.a.a(TAG, "closeCamera", true);
            if (this.seqCounter > 0 && this.mIsCameraOpen) {
                d.a(this.mWhich, 4, 0L, (HashMap<String, String>) null);
                d.a(this.actionSeq, 4, 0L, (HashMap<String, String>) null);
            }
            this.mWhich = -1;
            stopPreview();
            this.mCamera.a((Camera.PreviewCallback) null);
            this.mCameraSurfacePreview = null;
            this.mCamera.f();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.mCamera = null;
            this.mIDetection = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0261 A[Catch: Exception -> 0x02b2, TryCatch #2 {Exception -> 0x02b2, blocks: (B:74:0x024b, B:76:0x0261, B:77:0x029c), top: B:137:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c A[Catch: Exception -> 0x02b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x02b2, blocks: (B:74:0x024b, B:76:0x0261, B:77:0x029c), top: B:137:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0319  */
    @Override // android.hardware.Camera.PreviewCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPreviewFrame(byte[] r21, android.hardware.Camera r22) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.widget.tool.CameraManager.onPreviewFrame(byte[], android.hardware.Camera):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartFaceLiveAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afe4c178a6cd6bdf571fde4af95d41c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afe4c178a6cd6bdf571fde4af95d41c6");
            return;
        }
        resetOriginalColor();
        if (this.actionSeq == null || this.actionSeq.length <= 0) {
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(TAG, "face detection face ray not pass, index is " + this.mCurRayIndex, true);
        this.seqCounter = this.actionSeq.length;
        this.curActionIndex = 0;
        this.mCurRayIndex = 0;
        setWhich(this.actionSeq[this.curActionIndex]);
        this.mFaceLiveActionStartTime = System.currentTimeMillis();
        d.a(this.mWhich, 1, 0L, (HashMap<String, String>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaceRayColor(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b0526ae215dc3dbd4b8b7f3758f499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b0526ae215dc3dbd4b8b7f3758f499");
        } else if (this.mFaceRay == null || this.mFaceRay.length == 0 || i >= this.mFaceRay.length) {
        } else {
            String str = this.mFaceRay[i];
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a(TAG, "face detection face ray，setFaceRayColor： " + i + StringUtil.SPACE + str, true);
            try {
                i2 = Color.parseColor(str);
            } catch (Exception unused) {
                i2 = -1;
            }
            if (this.mRoot != null) {
                this.mRoot.setBackgroundColor(i2);
            }
            if (this.mCameraSurfacePreview != null) {
                this.mCameraSurfacePreview.setSurfaceBackgroundColor(i2);
            }
        }
    }

    private void saveOriginalColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb4e08f9376583ea6b829a595e1066a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb4e08f9376583ea6b829a595e1066a");
            return;
        }
        if (this.mCameraSurfacePreview != null) {
            com.meituan.android.yoda.widget.view.d dVar = this.mCameraSurfacePreview;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.widget.view.d.d;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "3f2f216ff08db5574a09490566a05a80", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "3f2f216ff08db5574a09490566a05a80");
            } else {
                if (dVar.f != null) {
                    dVar.f.g();
                }
                if (dVar.i != null) {
                    dVar.g = dVar.i.getCurrentTextColor();
                }
            }
        }
        if (this.mRoot != null) {
            this.mRootOriginalBackgroundColor = this.mRoot.getBackground();
            if (this.mRootOriginalBackgroundColor instanceof ColorDrawable) {
                this.mRootOriginalBackgroundColor = new ColorDrawable(((ColorDrawable) this.mRootOriginalBackgroundColor).getColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetOriginalColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba61f788d7f05296f3a41901c5c584c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba61f788d7f05296f3a41901c5c584c2");
            return;
        }
        if (this.mCameraSurfacePreview != null) {
            com.meituan.android.yoda.widget.view.d dVar = this.mCameraSurfacePreview;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.widget.view.d.d;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "71454c7353fe56219306067dec0aa3f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "71454c7353fe56219306067dec0aa3f7");
            } else {
                if (dVar.f != null) {
                    dVar.f.h();
                }
                dVar.setTipsColor(dVar.g);
                dVar.invalidate();
            }
        }
        if (this.mRoot != null) {
            if (this.mRootOriginalBackgroundColor != null) {
                this.mRoot.setBackground(this.mRootOriginalBackgroundColor);
            } else {
                this.mRoot.setBackgroundColor(-1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168 A[Catch: Exception -> 0x01d6, TryCatch #1 {Exception -> 0x01d6, blocks: (B:74:0x015e, B:76:0x0162, B:78:0x0168, B:84:0x017a, B:86:0x019d, B:80:0x016e, B:82:0x0174, B:89:0x01d2, B:92:0x01d8, B:56:0x0115), top: B:100:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d A[Catch: Exception -> 0x01d6, TryCatch #1 {Exception -> 0x01d6, blocks: (B:74:0x015e, B:76:0x0162, B:78:0x0168, B:84:0x017a, B:86:0x019d, B:80:0x016e, B:82:0x0174, B:89:0x01d2, B:92:0x01d8, B:56:0x0115), top: B:100:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2 A[Catch: Exception -> 0x01d6, TryCatch #1 {Exception -> 0x01d6, blocks: (B:74:0x015e, B:76:0x0162, B:78:0x0168, B:84:0x017a, B:86:0x019d, B:80:0x016e, B:82:0x0174, B:89:0x01d2, B:92:0x01d8, B:56:0x0115), top: B:100:0x015e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray collectOpenFile() {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.widget.tool.CameraManager.collectOpenFile():org.json.JSONArray");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSuccessResult(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73c82bdccc702d28b59b825a8ac68ab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73c82bdccc702d28b59b825a8ac68ab8");
            return;
        }
        this.mHandler.post(b.a(this, str));
        reportFaceDetectResult(true);
    }

    public static /* synthetic */ void lambda$processSuccessResult$11(CameraManager cameraManager, String str) {
        Object[] objArr = {cameraManager, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cdf49ed03a9652f886ea7870d5aac04f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cdf49ed03a9652f886ea7870d5aac04f");
            return;
        }
        JSONArray collectOpenFile = cameraManager.collectOpenFile();
        com.meituan.android.yoda.monitor.log.a.a(TAG, "processSuccessResult.", true);
        cameraManager.stopPreview();
        if (cameraManager.mCameraSurfacePreview != null) {
            com.meituan.android.yoda.widget.view.d dVar = cameraManager.mCameraSurfacePreview;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(collectOpenFile, str);
            Object[] objArr2 = {anonymousClass2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.widget.view.d.d;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "e09855066aca70f101fcb674be85ff3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "e09855066aca70f101fcb674be85ff3e");
            } else {
                dVar.f.a(dVar.e, 330.0f, 100L, anonymousClass2, dVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.widget.tool.CameraManager$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Animator.AnimatorListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ String c;

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        public AnonymousClass2(JSONArray jSONArray, String str) {
            this.b = jSONArray;
            this.c = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "050a93a1115945b6f237f6a168a2e713", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "050a93a1115945b6f237f6a168a2e713");
                return;
            }
            if (CameraManager.this.mIDetection != null) {
                CameraManager.this.mIDetection.onSuccess();
                for (YodaFaceDetectionResponseListener yodaFaceDetectionResponseListener : com.meituan.android.yoda.plugins.d.a().d) {
                    if (yodaFaceDetectionResponseListener != null) {
                        yodaFaceDetectionResponseListener.onFaceDetSuccess();
                    }
                }
            }
            CameraManager.this.mExecutorService.execute(c.a(this, this.b, this.c));
        }

        public static /* synthetic */ void a(AnonymousClass2 anonymousClass2, JSONArray jSONArray, String str) {
            Object[] objArr = {anonymousClass2, jSONArray, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            com.meituan.android.yoda.model.a[] aVarArr = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0990964e29cebb50b4b8063be324df63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0990964e29cebb50b4b8063be324df63");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "onAnimationEnd: start processing encoded jpeg, time= " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName(), true);
            if (CameraManager.this.mContextWeakReference == null || CameraManager.this.mContextWeakReference.get() == null || CameraManager.this.mIDetection == null) {
                return;
            }
            try {
                if (CameraManager.this.encodeData != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    aVarArr = com.meituan.android.yoda.model.a.a(CameraManager.this.encodeData, CameraManager.this.encodeDataLen, CameraManager.this.faceRect, CameraManager.this.check, CameraManager.this.mRayEncodeData, CameraManager.this.rayEncodeDataLen, CameraManager.this.rayFaceRect, CameraManager.this.rayCheck, CameraManager.this.rayGetBestFrame);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "face detect result parse time = " + ((int) (currentTimeMillis2 - currentTimeMillis)), true);
                } else {
                    com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "onAnimationEnd, face bitmap is null !", true);
                }
                HashMap<String, String> hashMap = new HashMap<>();
                if (jSONArray != null) {
                    try {
                        hashMap.put("open_file_count", String.valueOf(CameraManager.this.mOpenFileCount));
                        hashMap.put("open_file_content", jSONArray.toString());
                    } catch (Exception e) {
                        com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "paramMap, error !" + e.getMessage(), true);
                        e.printStackTrace();
                    }
                }
                CameraManager.this.mIDetection.onFaceImageReady(aVarArr, str, hashMap);
            } catch (Exception e2) {
                com.meituan.android.yoda.monitor.log.a.a(CameraManager.TAG, "face detect result parse exception = " + e2.getMessage(), true);
                e2.printStackTrace();
            }
        }
    }

    private void debounce(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a0529c8e933a4b789735d2d020f8dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a0529c8e933a4b789735d2d020f8dc3");
        } else if (this.mStatus.containsKey(Integer.valueOf(i))) {
            int intValue = this.mStatus.get(Integer.valueOf(i)).intValue();
            if (intValue > 4) {
                setTips(i);
                this.mStatus.put(Integer.valueOf(i), 0);
                return;
            }
            this.mStatus.put(Integer.valueOf(i), Integer.valueOf(intValue + 1));
        } else {
            this.mStatus.put(Integer.valueOf(i), 1);
        }
    }

    private void setTips(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da627ad664a9620cb51b0a3384c95476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da627ad664a9620cb51b0a3384c95476");
            return;
        }
        if (this.mWhich != 5) {
            this.mCameraSurfacePreview.setTargetAngle(0.0f);
        }
        if (this.mCameraSurfacePreview == null) {
            return;
        }
        switch (i) {
            case -13:
                this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_face_blur), 200L);
                return;
            case -12:
                this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_face_unusual_light), 200L);
                return;
            case -11:
                this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_face_is_blocking), 200L);
                return;
            case -10:
                this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_face_too_big), 200L);
                return;
            case -9:
                this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_face_too_small), 200L);
                return;
            case -8:
            case -7:
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
                this.mCameraSurfacePreview.a(x.a((int) R.string.yoda_face_verify_face_not_detect), 200L);
                return;
            default:
                return;
        }
    }

    public void setIDetection(IDetection iDetection) {
        this.mIDetection = iDetection;
    }

    public void reportFaceDetectResult(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2906bfbdb2803fff091dad2803071ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2906bfbdb2803fff091dad2803071ff");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("duration", (Number) 10);
        com.meituan.android.yoda.monitor.report.a.a("yoda_face_live", z ? 200 : 9002, 10, jsonObject);
    }

    public long getPreviewStartTime() {
        return this.previewStartTime;
    }

    public com.meituan.android.yoda.widget.view.d getCameraSurfacePreview() {
        return this.mCameraSurfacePreview;
    }

    private int calculateCameraDisplayOrientation(Context context, Camera.CameraInfo cameraInfo) {
        int rotation;
        WindowManager windowManager;
        int i = 0;
        Object[] objArr = {context, cameraInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc680b225f4ca7fc33abe6b03f8c9d9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc680b225f4ca7fc33abe6b03f8c9d9e")).intValue();
        }
        if (l.b()) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = z.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "8a1fb9094283c18846d82cdadc1baac8", RobustBitConfig.DEFAULT_VALUE)) {
                rotation = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "8a1fb9094283c18846d82cdadc1baac8")).intValue();
            } else {
                rotation = (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null || windowManager.getDefaultDisplay() == null) ? 0 : windowManager.getDefaultDisplay().getRotation();
            }
            switch (rotation) {
                case 1:
                    i = 90;
                    break;
                case 2:
                    i = 180;
                    break;
                case 3:
                    i = 270;
                    break;
            }
            if (cameraInfo.facing == 1) {
                return (360 - ((cameraInfo.orientation + i) % ROTATION_DEGREES_360)) % ROTATION_DEGREES_360;
            }
            return ((cameraInfo.orientation - i) + ROTATION_DEGREES_360) % ROTATION_DEGREES_360;
        }
        return 90;
    }
}
