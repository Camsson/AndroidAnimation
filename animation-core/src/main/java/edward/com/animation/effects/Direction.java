package edward.com.animation.effects;

import android.animation.Animator;
import android.view.View;

import edward.com.animation.effects.HasDirection;

public enum Direction {
    TOP_LEFT{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.topLeft(target);
        }
    },
    TOP{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.top(target);
        }
    },
    TOP_RIGHT{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.topRight(target);
        }
    },
    RIGHT{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.right(target);
        }
    },
    BOTTOM_RIGHT{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.bottomRight(target);
        }
    },
    BOTTOM{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.bottom(target);
        }
    },
    BOTTOM_LEFT{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.bottomLeft(target);
        }
    },
    LEFT{
        @Override
        public Animator[] getAnimators(View target,HasDirection direction) {
            return direction.left(target);
        }
    };

    public abstract Animator[] getAnimators(View target,HasDirection direction);
}