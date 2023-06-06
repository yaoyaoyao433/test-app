package io.agora.rtc.video;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class CameraCapturerConfiguration {
    public CAMERA_DIRECTION cameraDirection;
    public CAPTURER_OUTPUT_PREFERENCE preference;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum CAPTURER_OUTPUT_PREFERENCE {
        CAPTURER_OUTPUT_PREFERENCE_AUTO(0),
        CAPTURER_OUTPUT_PREFERENCE_PERFORMANCE(1),
        CAPTURER_OUTPUT_PREFERENCE_PREVIEW(2);
        
        private int value;

        CAPTURER_OUTPUT_PREFERENCE(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum CAMERA_DIRECTION {
        CAMERA_REAR(0),
        CAMERA_FRONT(1);
        
        private int value;

        CAMERA_DIRECTION(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public CameraCapturerConfiguration(CAPTURER_OUTPUT_PREFERENCE capturer_output_preference, CAMERA_DIRECTION camera_direction) {
        this.preference = capturer_output_preference;
        this.cameraDirection = camera_direction;
    }
}
