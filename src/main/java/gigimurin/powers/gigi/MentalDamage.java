package gigimurin.powers.gigi;

import com.megacrit.cardcrawl.core.AbstractCreature;
import gigimurin.powers.AbstractEasyPower;

public class MentalDamage extends AbstractEasyPower {

    public MentalDamage(String ID, String NAME, PowerType powerType, boolean isTurnBased, AbstractCreature owner, int amount) {
        super(ID, NAME, powerType, isTurnBased, owner, amount);
    }
}
