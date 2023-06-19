package racingcar.game

import racingcar.car.Cars
import racingcar.car.RoundCount
import racingcar.view.InputView
import racingcar.view.ResultView

class RacingCarGame(
    private var inputView: InputView = InputView(),
    private var resultView: ResultView = ResultView()
) {

    private lateinit var cars: Cars

    fun play() {
        getCars()
        val roundCount = RoundCount(inputView.inputCarsCount())
        repeat(roundCount.count) {
            cars.move()
            printResult()
        }
    }

    private fun printResult() {
        val result: List<String> = cars.getPathStrings()
        resultView.printResult(result)
    }

    private fun getCars() {
        val carCounts = inputView.inputCarsCount()
        // todo : inputView.inputCarNames()를 통해 자동차 이름을 입력받아 Cars를 생성하세요.
        // cars = Cars("", carCounts)
    }
}
