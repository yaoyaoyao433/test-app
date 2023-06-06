package com.meituan.ai.speech.base.net.base;

import com.huawei.hms.api.ConnectionResult;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/meituan/ai/speech/base/net/base/SpeechStatusCode;", "", "code", "", "msg", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "SUCCESS", "SUCCESS_OUT", "AUTH_CLIENT_TYPE_ERROR", "AUTH_CLIENT_ERROR", "AUTH_TOKEN_AMOUNT_LIMIT", "LOCAL_FILE_TYPE_ERROR", "SERVER_ERROR_PARAMS", "SERVER_ERROR_PARAMS_NO_FOUND", "SERVER_ERROR_DECODE_PARAMS", "SERVER_ERROR_AUDIO_ERROR", "SERVER_ERROR_AUDIO_FORMAT_ERROR", "SERVER_ERROR_AUDIO_DATA_ERROR", "SERVER_ERROR_AUDIO_TIME_TOO_SHORT", "SERVER_ERROR_AUDIO_TIME_TOO_LONG", "SERVER_ERROR_TOKEN_ERROR", "SERVER_ERROR_TOKEN_TIMEOUT_ERROR", "SERVER_ERROR_TOKEN_UNLESS_ERROR", "SERVER_ERROR_INNER_ERROR", "SERVER_ERROR_RPC_ERROR", "SERVER_ERROR_DATABASE_ERROR", "RECOGNIZE_FILE_ERROR", "RECOGNIZE_FILE_TOO_LARGE", "PIKE_ERROR", "OTHER_ERROR", "RESPONSE_DATA_PARSE_ERROR", "TOKEN_IS_NULL", "RETROFIT_REQUEST_FAILED", "TOKEN_PARAMS_IS_NULL", "DATA_OF_BODY_IS_NULL_IN_RESPONSE", "RESPONSE_IS_NULL", "NO_RECORD_PERMISSION", "NO_SDCARD_PERMISSION", "PARAMS_ERROR", "ERROR_RECOG_DATA_TOO_LARGE", "ERROR_RECOG_INTERVAL_TOO_SHORT", "ERROR_NOT_INIT", "ERROR_REOPEN_LISTENING", "ERROR_RECORD", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public enum a {
    SUCCESS(0, "请求成功"),
    SUCCESS_OUT(200, "请求成功"),
    AUTH_CLIENT_TYPE_ERROR(4000, "invalid_type 无效类型"),
    AUTH_CLIENT_ERROR(MapConstant.LayerPropertyFlag_MarkerSpacing, "invalid_client"),
    AUTH_TOKEN_AMOUNT_LIMIT(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, "token_amount_limit"),
    LOCAL_FILE_TYPE_ERROR(7500, "文件格式错误"),
    SERVER_ERROR_PARAMS(400000, "参数错误"),
    SERVER_ERROR_PARAMS_NO_FOUND(400001, "未找到参数"),
    SERVER_ERROR_DECODE_PARAMS(400002, "参数解析失败"),
    SERVER_ERROR_AUDIO_ERROR(400100, "音频错误"),
    SERVER_ERROR_AUDIO_FORMAT_ERROR(400101, "音频格式错误"),
    SERVER_ERROR_AUDIO_DATA_ERROR(400102, "数据错误"),
    SERVER_ERROR_AUDIO_TIME_TOO_SHORT(400103, "时长过短"),
    SERVER_ERROR_AUDIO_TIME_TOO_LONG(400104, "时长过长"),
    SERVER_ERROR_TOKEN_ERROR(401000, "鉴权失败"),
    SERVER_ERROR_TOKEN_TIMEOUT_ERROR(401001, "token 过期"),
    SERVER_ERROR_TOKEN_UNLESS_ERROR(401002, "token 无效"),
    SERVER_ERROR_INNER_ERROR(500000, "服务器内部错误"),
    SERVER_ERROR_RPC_ERROR(500100, "RPC错误"),
    SERVER_ERROR_DATABASE_ERROR(500200, "数据库错误"),
    RECOGNIZE_FILE_ERROR(500300, "文件段式识别错误!"),
    RECOGNIZE_FILE_TOO_LARGE(500301, "只支持100MB以内音频"),
    PIKE_ERROR(501000, "Pike错误"),
    OTHER_ERROR(ConnectionResult.NETWORK_ERROR, "Server 未知错误"),
    RESPONSE_DATA_PARSE_ERROR(ConnectionResult.RESOLUTION_REQUIRED, "Response数据格式错误，不能解析"),
    TOKEN_IS_NULL(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "获取到的token为空"),
    RETROFIT_REQUEST_FAILED(ConnectionResult.RESTRICTED_PROFILE, "retrofit请求失败"),
    TOKEN_PARAMS_IS_NULL(ConnectionResult.SERVICE_UPDATING, "鉴权参数为空"),
    DATA_OF_BODY_IS_NULL_IN_RESPONSE(9006, "Response.body中的data为空"),
    RESPONSE_IS_NULL(9007, "Response is null"),
    NO_RECORD_PERMISSION(9100, "用户无录音权限"),
    NO_SDCARD_PERMISSION(9101, "用户无读写存储权限"),
    PARAMS_ERROR(9102, "参数错误"),
    ERROR_RECOG_DATA_TOO_LARGE(9200, "流式识别的传入数据包超过限制，可以传入的数据包最大为："),
    ERROR_RECOG_INTERVAL_TOO_SHORT(9201, "两次识别请求之间时间间隔太短"),
    ERROR_NOT_INIT(9300, "服务未初始化"),
    ERROR_REOPEN_LISTENING(9301, "当前运行中，重复开启"),
    ERROR_RECORD(9302, "录音错误");
    
    public static ChangeQuickRedirect a;
    public final int N;
    @NotNull
    public final String O;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5aed2b46f458a50fc8634658dd6defb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5aed2b46f458a50fc8634658dd6defb") : Enum.valueOf(a.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (a[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0313831e085255ec3ad62046b916e845", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0313831e085255ec3ad62046b916e845") : values().clone());
    }

    a(int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da72e9ec6c43161b0ecae2e16fc3066", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da72e9ec6c43161b0ecae2e16fc3066");
            return;
        }
        this.N = i;
        this.O = str;
    }
}
