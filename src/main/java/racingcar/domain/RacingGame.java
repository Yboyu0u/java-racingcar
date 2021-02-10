package racingcar.domain;

import racingcar.utils.RandomValueGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGame {
    private boolean running = true;

    public void start() {
        try {
            Names names = InputView.getNames();
            Trial trial = InputView.getTrial();
            Cars cars = new Cars(names);

            run(cars, trial);
            OutputView.showResult(cars.getWinners());
            running = false;
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
        }
    }

    private void run(Cars cars, Trial trial) {
        OutputView.printResultTitle();
        while (trial.decrement()) {
            cars.moveCars();
            OutputView.printCurrentResult(cars.getCurrentCarsInfo());
        }
    }

    public boolean isRunning() {
        return running;
    }
}
