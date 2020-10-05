public class Q3_bulb {
    private boolean work = false,   // work determines if on/off.
                    func = true;    //func determines if its functional
    private int runs = 0,       // runs determines how many times has light bulb been used
                uses = 5;      // uses determines minimal amount of uses

    /**
     * Creates a default light bulb
     */
    public Q3_bulb(){}

    /**
     * Allows creating specific light bulb
     * @param w Specify if light bulb is ON/OFF
     * @param f Specify if light bulb is functional
     * @param r Specify how many times has the light bulb been used
     * @param u Specify how many uses guaranteed the light bulb has
     */
    public Q3_bulb(boolean w, boolean f,int r,int u){
        work = w;
        func = f;
        runs = r;
        uses = u;
    }

    /**
     * Returns ON / OFF condition of light bulb
     * @return true or false
     */
    public boolean is_work(){
        return work;
    }

    /**
     * Returns if light bulb is functional or not.
     * @return true or false
     */
    public boolean is_func(){
        return func;
    }

    /**
     * Returns how many times light bulb has been used.
     * @return int #
     */
    public int get_runs(){
        return runs;
    }

    /**
     * Returns how many uses guaranteed the light bulb has
     * @return int #
     */
    public int get_uses(){
        return uses;
    }

    /**
     * Forces the light bulb to be on or off
     * @param w true or false
     */
    public void set_work(boolean w){
        work = w;
    }

    /**
     * Forces the light bulb to be functional or not
     * @param f true or false
     */
    public void set_func(boolean f){
        work = f;
    }

    /**
     * Changes how many runs the light bulb has had.
     * @param r int RUNS
     */
    public void set_runs(int r){
        runs = r;
    }

    /**
     * Changes how many uses the light bulb has.
     * @param u int USES
     */
    public void set_uses(int u){
        uses = u;
    }

    /**
     * Increases uses on the light bulb.
     * @param inc int = increment amount.
     */
    public void inc_runs(int inc){
        runs+=inc;
    }

    /**
     * Clicks the lightswitch on or off.
     */
    public void click(){
        if (func) {
            if (work)
                work = false;
            else {
                runs++;
                work = true;
            }
        }
    }

    /**
     * Returns the observable status of light bulb as a string
     * @return ON or OFF
     */
    public String observe(){
        if (work)
            return "ON";
        else
            return "OFF";
    }
}
