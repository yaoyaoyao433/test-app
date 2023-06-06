package io.agora.rtc.audio;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import io.agora.rtc.internal.Logging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaCodecAudioDecoder {
    private static int HTTP_REQUEST_TIMEOUT = 400;
    private static int MAX_DECODER_RETRY_COUNT = 300;
    private ByteBuffer mDecodedRAWBuffer;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;
    private ByteBuffer[] mOutputBuffers;
    private Context mContext = null;
    private MediaCodec mMediaCodec = null;
    private MediaExtractor mExtractor = null;
    private MediaFormat mTrackFormat = null;
    private boolean mDecodedDataReady = false;
    private boolean eoInputStream = false;
    private boolean eoOutputStream = false;
    private int mSampleRate = 44100;
    private int mChannels = 2;
    private int mRetryCount = 0;
    private MediaCodec mAACDecoder = null;
    private ByteBuffer mAACOutputBuffer = ByteBuffer.allocateDirect(4096);
    private String TAG = "MediaCodec Audio Decoder";

    public boolean createStreaming(String str) {
        try {
            String str2 = this.TAG;
            Logging.i(str2, "Try to decode audio file : " + str);
            this.mRetryCount = 0;
            boolean startsWith = str.startsWith("/assets/");
            boolean startsWith2 = str.toLowerCase().startsWith("http");
            this.mExtractor = new MediaExtractor();
            if (startsWith) {
                if (this.mContext == null) {
                    return false;
                }
                AssetFileDescriptor openFd = this.mContext.getAssets().openFd(str.substring("/assets/".length()));
                this.mExtractor.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            } else if (startsWith2) {
                try {
                    HttpURLConnection.setFollowRedirects(false);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                    httpURLConnection.setConnectTimeout(HTTP_REQUEST_TIMEOUT);
                    httpURLConnection.setReadTimeout(HTTP_REQUEST_TIMEOUT);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        return false;
                    }
                    this.mExtractor.setDataSource(str);
                } catch (SocketTimeoutException unused) {
                    String str3 = this.TAG;
                    Logging.e(str3, "Connect timeout on URL : " + str);
                    return false;
                } catch (IOException unused2) {
                    String str4 = this.TAG;
                    Logging.e(str4, "Connect IOException on URL : " + str);
                    return false;
                }
            } else {
                this.mExtractor.setDataSource(str);
            }
            int trackCount = this.mExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                this.mExtractor.unselectTrack(i);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= trackCount) {
                    break;
                }
                this.mTrackFormat = this.mExtractor.getTrackFormat(i2);
                String string = this.mTrackFormat.getString(IMediaFormat.KEY_MIME);
                if (string.contains("audio/")) {
                    this.mExtractor.selectTrack(i2);
                    this.mMediaCodec = MediaCodec.createDecoderByType(string);
                    this.mMediaCodec.configure(this.mTrackFormat, (Surface) null, (MediaCrypto) null, 0);
                    break;
                }
                i2++;
            }
            if (this.mMediaCodec != null) {
                this.mMediaCodec.start();
            }
            this.mChannels = this.mTrackFormat.getInteger("channel-count");
            this.mSampleRate = this.mTrackFormat.getInteger("sample-rate");
            if (this.mSampleRate == 22050) {
                this.mSampleRate = 22000;
            } else if (this.mSampleRate == 11025) {
                this.mSampleRate = 11000;
            }
            this.mFileLength = this.mTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when creating aac audio file decoder");
            e.printStackTrace();
            return false;
        }
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public long getFileLength() {
        return this.mFileLength;
    }

    public long getCurrentFilePosition() {
        return this.mExtractor.getSampleTime();
    }

    public void setCurrentFilePosition(long j) {
        this.mExtractor.seekTo(j, 2);
    }

    public boolean getDecodeDataReadyFlag() {
        return this.mDecodedDataReady;
    }

    public void releaseStreaming() {
        try {
            if (this.mMediaCodec != null) {
                this.mMediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (this.mExtractor != null) {
                this.mExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when releasing audio file stream");
            e.printStackTrace();
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public void rewindStreaming() {
        try {
            this.mExtractor.seekTo(0L, 1);
            this.mMediaCodec.flush();
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when rewinding audio file stream");
            e.printStackTrace();
        }
        this.eoInputStream = false;
        this.eoOutputStream = false;
        this.mDecodedDataReady = false;
    }

    public boolean decodeFrame() {
        int dequeueInputBuffer;
        ByteBuffer byteBuffer;
        int i;
        try {
            if (!this.eoInputStream && (dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0L)) >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
                } else {
                    this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                    byteBuffer = this.mInputBuffers[dequeueInputBuffer];
                }
                int readSampleData = this.mExtractor.readSampleData(byteBuffer, 0);
                if (readSampleData <= 0) {
                    this.eoInputStream = true;
                    i = 0;
                } else {
                    i = readSampleData;
                }
                long sampleTime = this.mExtractor.getSampleTime();
                int sampleFlags = this.mExtractor.getSampleFlags();
                if (this.eoInputStream) {
                    sampleFlags |= 4;
                }
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, sampleTime, sampleFlags);
                this.mExtractor.advance();
            }
            if (!this.eoOutputStream) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                this.mDecodedDataReady = false;
                switch (dequeueOutputBuffer) {
                    case -3:
                    case -2:
                        break;
                    case -1:
                        this.mRetryCount++;
                        if (this.mRetryCount >= MAX_DECODER_RETRY_COUNT) {
                            Logging.e(this.TAG, "EAGAIN count=" + this.mRetryCount + " presentationTimeUs=" + bufferInfo.presentationTimeUs + " totalUs=" + this.mFileLength + " Force EOS");
                            this.eoOutputStream = true;
                            break;
                        }
                        break;
                    default:
                        this.mRetryCount = 0;
                        if (dequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 4) {
                                this.eoOutputStream = true;
                            }
                            if (Build.VERSION.SDK_INT >= 21) {
                                cloneByteBuffer(this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer));
                            } else {
                                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                                cloneByteBufferByLength(this.mOutputBuffers[dequeueOutputBuffer], bufferInfo.size);
                            }
                            this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.mDecodedDataReady = true;
                            break;
                        }
                        break;
                }
            }
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when decoding audio file stream");
            e.printStackTrace();
        }
        return this.eoOutputStream;
    }

    private boolean checkInfoChange() {
        boolean z;
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mSampleRate == integer && this.mChannels == integer2) {
                z = false;
                this.mSampleRate = integer;
                this.mChannels = integer2;
                return z;
            }
            z = true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when checking file's new format");
            e.printStackTrace();
            return false;
        }
    }

    private void cloneByteBuffer(ByteBuffer byteBuffer) {
        try {
            if (this.mDecodedRAWBuffer == null || this.mDecodedRAWBuffer.limit() != byteBuffer.limit()) {
                if (this.mDecodedRAWBuffer != null) {
                    this.mDecodedRAWBuffer.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(byteBuffer.limit());
            }
            this.mDecodedRAWBuffer.position(0);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cloneByteBufferByLength(ByteBuffer byteBuffer, int i) {
        try {
            if (this.mDecodedRAWBuffer == null || this.mDecodedRAWBuffer.capacity() < i) {
                if (this.mDecodedRAWBuffer != null) {
                    this.mDecodedRAWBuffer.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(i);
            }
            this.mDecodedRAWBuffer.position(0);
            byteBuffer.limit(i);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkAACSupported() {
        MediaCodecInfo[] codecInfos;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                    if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().toLowerCase().contains("nvidia")) {
                        return false;
                    }
                }
            } else {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder() && codecInfoAt.getName().toLowerCase().contains("nvidia")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when checking aac codec availability");
            e.printStackTrace();
            return false;
        }
    }

    public boolean createAACStreaming(int i) {
        try {
            this.mAACDecoder = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, 1);
            createAudioFormat.setInteger("sample-rate", i);
            createAudioFormat.setInteger("channel-count", 1);
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{18, -120}));
            this.mAACDecoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            if (this.mAACDecoder != null) {
                this.mAACDecoder.start();
            }
            return true;
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when creating aac decode stream");
            e.printStackTrace();
            return false;
        }
    }

    public void releaseAACStreaming() {
        try {
            if (this.mAACDecoder != null) {
                this.mAACDecoder.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when releasing aac decode stream");
            e.printStackTrace();
        }
    }

    public int decodeAACFrame(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i = 0;
        try {
            int dequeueInputBuffer = this.mAACDecoder.dequeueInputBuffer(200L);
            if (dequeueInputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACDecoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    byteBuffer2 = this.mAACDecoder.getInputBuffers()[dequeueInputBuffer];
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(bufferInfo, 0L);
            switch (dequeueOutputBuffer) {
                case -3:
                case -2:
                case -1:
                    return 0;
                default:
                    if (dequeueOutputBuffer >= 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            byteBuffer = this.mAACDecoder.getOutputBuffer(dequeueOutputBuffer);
                        } else {
                            byteBuffer = this.mAACDecoder.getOutputBuffers()[dequeueOutputBuffer];
                        }
                        int i2 = bufferInfo.size;
                        try {
                            this.mAACOutputBuffer.position(0);
                            byteBuffer.limit(i2);
                            this.mAACOutputBuffer.put(byteBuffer);
                            this.mAACDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                            return i2;
                        } catch (Exception e) {
                            i = i2;
                            e = e;
                            Logging.e(this.TAG, "Error when decoding aac stream");
                            e.printStackTrace();
                            return i;
                        }
                    }
                    return 0;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
